package gov.epa.bencloud.api.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.impl.DSL;
import static gov.epa.bencloud.server.database.jooq.Tables.*;

import gov.epa.bencloud.api.HIFApi;
import gov.epa.bencloud.api.ValuationApi;
import gov.epa.bencloud.api.model.ValuationConfig;
import gov.epa.bencloud.api.model.ValuationTaskConfig;
import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.database.jooq.tables.records.InflationEntryRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.ValuationFunctionRecord;
import gov.epa.bencloud.server.tasks.TaskComplete;
import gov.epa.bencloud.server.tasks.model.Task;
import spark.Request;
import spark.Response;

/**
 * @author jimanderton
 *
 */
public class ApiUtil {

	
	/**
	 * @param columnIdx
	 * @param rowIdx
	 * @return unique long integer using the Cantor pairing function to combine column and row indices
	 * https://en.wikipedia.org/wiki/Pairing_function
	 */
	public static long getCellId(int columnIdx, int rowIdx) {
		return (long)(((columnIdx+rowIdx)*(columnIdx+rowIdx+1)*0.5)+rowIdx);
	}

	public static void main(String[] args) {
		System.out.println(ApiUtil.getCellId(164, 92));
	}

	public static Map<String, Double> getInflationIndices(int id, Integer inflationYear) {

		InflationEntryRecord inflationRecord = DSL.using(JooqUtil.getJooqConfiguration())
				.selectFrom(INFLATION_ENTRY)
				.where(INFLATION_ENTRY.INFLATION_DATASET_ID.eq(id).and(INFLATION_ENTRY.ENTRY_YEAR.eq(inflationYear)))
				.fetchOne();
		Map<String, Double> inflationIndices = new HashMap<String, Double>();
		inflationIndices.put("AllGoodsIndex", inflationRecord.getAllGoodsIndex().doubleValue());
		inflationIndices.put("MedicalCostIndex", inflationRecord.getMedicalCostIndex().doubleValue());		
		inflationIndices.put("WageIndex", inflationRecord.getWageIndex().doubleValue());
		
		return inflationIndices;
	}

	public static Map<Short, Record2<Short, BigDecimal>> getIncomeGrowthFactors(int id, Integer popYear) {

		Map<Short, Record2<Short, BigDecimal>> incomeGrowthFactorRecords = DSL.using(JooqUtil.getJooqConfiguration())
				.select(INCOME_GROWTH_ADJ_FACTOR.ENDPOINT_GROUP_ID,
						INCOME_GROWTH_ADJ_FACTOR.MEAN_VALUE)
				.from(INCOME_GROWTH_ADJ_FACTOR)
				.where(INCOME_GROWTH_ADJ_FACTOR.INCOME_GROWTH_ADJ_DATASET_ID.eq((short) id).and(INCOME_GROWTH_ADJ_FACTOR.GROWTH_YEAR.eq(popYear.shortValue())))
				.fetchMap(INCOME_GROWTH_ADJ_FACTOR.ENDPOINT_GROUP_ID);
				
		return incomeGrowthFactorRecords;
	}

	public static Object getTaskResultDetails(Request req, Response res) {
		String uuid = req.params("uuid");

		Task task = TaskComplete.getTaskFromCompleteRecord(uuid);
		switch(task.getType()) {
		case "HIF":
			return HIFApi.getHifResultDetails(req, res);
		case "Valuation":
			return ValuationApi.getValuationResultDetails(req, res);
		default:
				
		}
		
		return null;
	}

	public static Map<String, Map<Long, Double>> getVariablesForValuation(ValuationTaskConfig valuationTaskConfig, List<ValuationFunctionRecord> vfDefinitionList) {
		 // Load list of functions from the database
		List<String> allVariableNames = ApiUtil.getAllVariableNames(valuationTaskConfig.variableDatasetId);
		HashMap<String, Map<Long, Double>> variableMap = new HashMap<String, Map<Long, Double>>();
		
		//Look at all valuation functions to determine which variables are needed
		for(String variableName: allVariableNames) {
			for(ValuationFunctionRecord function : vfDefinitionList) {
				if(function.getFunctionText().toLowerCase().contains(variableName)) {
					if(!variableMap.containsKey(variableName)) {
						variableMap.put(variableName, null);
					}
				}
			}
		}
		// Finally load the cell values for each needed variable
		for(Entry<String, Map<Long, Double>> variable : variableMap.entrySet()) {
			variable.setValue(ApiUtil.getVariableCellMap(variable.getKey()));
		}
		
		return variableMap;
	}

	private static Map<Long, Double> getVariableCellMap(String key) {
		Map<Long, Double> cellMap = new HashMap<Long, Double>();

		Result<Record2<Integer, BigDecimal>> results = DSL.using(JooqUtil.getJooqConfiguration())
		.select(VARIABLE_VALUE.GRID_CELL_ID
				, VARIABLE_VALUE.VALUE)
		.from(VARIABLE_VALUE)
		.join(VARIABLE_ENTRY).on(VARIABLE_ENTRY.ID.eq(VARIABLE_VALUE.VARIABLE_ENTRY_ID))
		.where(VARIABLE_ENTRY.NAME.equalIgnoreCase(key))
		.fetch();
		
		for(Record2<Integer, BigDecimal> result : results) {
			cellMap.put(result.value1().longValue(), result.value2().doubleValue());
		}
		return cellMap;
	}

	private static List<String> getAllVariableNames(Integer variableDatasetId) {
		if(variableDatasetId == null) {
			return null;
		}

		List<String> allVariableNames = DSL.using(JooqUtil.getJooqConfiguration())
				.select(VARIABLE_ENTRY.NAME)
				.from(VARIABLE_ENTRY)
				.where(VARIABLE_ENTRY.VARIABLE_DATASET_ID.eq(variableDatasetId))
				.orderBy(VARIABLE_ENTRY.NAME)
				.fetch(VARIABLE_ENTRY.NAME);
		return allVariableNames;
	}
}