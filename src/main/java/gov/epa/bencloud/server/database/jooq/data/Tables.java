/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data;


import gov.epa.bencloud.server.database.jooq.data.tables.AgeRange;
import gov.epa.bencloud.server.database.jooq.data.tables.AirQualityCell;
import gov.epa.bencloud.server.database.jooq.data.tables.AirQualityLayer;
import gov.epa.bencloud.server.database.jooq.data.tables.CrosswalkDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.CrosswalkEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.Endpoint;
import gov.epa.bencloud.server.database.jooq.data.tables.EndpointGroup;
import gov.epa.bencloud.server.database.jooq.data.tables.Ethnicity;
import gov.epa.bencloud.server.database.jooq.data.tables.Gender;
import gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence;
import gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation;
import gov.epa.bencloud.server.database.jooq.data.tables.GetVariable;
import gov.epa.bencloud.server.database.jooq.data.tables.GridDefinition;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunction;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionGroup;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionGroupMember;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResult;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResultDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResultFunctionConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceValue;
import gov.epa.bencloud.server.database.jooq.data.tables.IncomeGrowthAdjDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.IncomeGrowthAdjFactor;
import gov.epa.bencloud.server.database.jooq.data.tables.InflationDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.InflationEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.Pollutant;
import gov.epa.bencloud.server.database.jooq.data.tables.PollutantMetric;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigEthnicity;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigGender;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigRace;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationYear;
import gov.epa.bencloud.server.database.jooq.data.tables.Race;
import gov.epa.bencloud.server.database.jooq.data.tables.SeasonalMetric;
import gov.epa.bencloud.server.database.jooq.data.tables.SeasonalMetricSeason;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskComplete;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskQueue;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskWorker;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationFunction;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationFunctionDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResult;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResultDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResultFunctionConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableValue;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetIncidenceRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetPopulationRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetVariableRecord;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>data.age_range</code>.
     */
    public static final AgeRange AGE_RANGE = AgeRange.AGE_RANGE;

    /**
     * The table <code>data.air_quality_cell</code>.
     */
    public static final AirQualityCell AIR_QUALITY_CELL = AirQualityCell.AIR_QUALITY_CELL;

    /**
     * The table <code>data.air_quality_layer</code>.
     */
    public static final AirQualityLayer AIR_QUALITY_LAYER = AirQualityLayer.AIR_QUALITY_LAYER;

    /**
     * The table <code>data.crosswalk_dataset</code>.
     */
    public static final CrosswalkDataset CROSSWALK_DATASET = CrosswalkDataset.CROSSWALK_DATASET;

    /**
     * The table <code>data.crosswalk_entry</code>.
     */
    public static final CrosswalkEntry CROSSWALK_ENTRY = CrosswalkEntry.CROSSWALK_ENTRY;

    /**
     * The table <code>data.endpoint</code>.
     */
    public static final Endpoint ENDPOINT = Endpoint.ENDPOINT;

    /**
     * The table <code>data.endpoint_group</code>.
     */
    public static final EndpointGroup ENDPOINT_GROUP = EndpointGroup.ENDPOINT_GROUP;

    /**
     * The table <code>data.ethnicity</code>.
     */
    public static final Ethnicity ETHNICITY = Ethnicity.ETHNICITY;

    /**
     * The table <code>data.gender</code>.
     */
    public static final Gender GENDER = Gender.GENDER;

    /**
     * The table <code>data.get_incidence</code>.
     */
    public static final GetIncidence GET_INCIDENCE = GetIncidence.GET_INCIDENCE;

    /**
     * Call <code>data.get_incidence</code>.
     */
    public static Result<GetIncidenceRecord> GET_INCIDENCE(
          Configuration configuration
        , Integer _DatasetId
        , Integer _Year
        , Integer _EndpointId
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Short _StartAge
        , Short _EndAge
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
              _DatasetId
            , _Year
            , _EndpointId
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _StartAge
            , _EndAge
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_incidence</code> as a table.
     */
    public static GetIncidence GET_INCIDENCE(
          Integer _DatasetId
        , Integer _Year
        , Integer _EndpointId
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Short _StartAge
        , Short _EndAge
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
              _DatasetId
            , _Year
            , _EndpointId
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _StartAge
            , _EndAge
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_incidence</code> as a table.
     */
    public static GetIncidence GET_INCIDENCE(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer> _EndpointId
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Short> _StartAge
        , Field<Short> _EndAge
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
              _DatasetId
            , _Year
            , _EndpointId
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _StartAge
            , _EndAge
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_population</code>.
     */
    public static final GetPopulation GET_POPULATION = GetPopulation.GET_POPULATION;

    /**
     * Call <code>data.get_population</code>.
     */
    public static Result<GetPopulationRecord> GET_POPULATION(
          Configuration configuration
        , Integer _DatasetId
        , Integer _Year
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Integer[] _AgeRangeId
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
              _DatasetId
            , _Year
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _AgeRangeId
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_population</code> as a table.
     */
    public static GetPopulation GET_POPULATION(
          Integer _DatasetId
        , Integer _Year
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Integer[] _AgeRangeId
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
              _DatasetId
            , _Year
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _AgeRangeId
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_population</code> as a table.
     */
    public static GetPopulation GET_POPULATION(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Integer[]> _AgeRangeId
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
              _DatasetId
            , _Year
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _AgeRangeId
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_variable</code>.
     */
    public static final GetVariable GET_VARIABLE = GetVariable.GET_VARIABLE;

    /**
     * Call <code>data.get_variable</code>.
     */
    public static Result<GetVariableRecord> GET_VARIABLE(
          Configuration configuration
        , Integer _DatasetId
        , String[] _VariableName
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
              _DatasetId
            , _VariableName
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_variable</code> as a table.
     */
    public static GetVariable GET_VARIABLE(
          Integer _DatasetId
        , String[] _VariableName
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
              _DatasetId
            , _VariableName
            , _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_variable</code> as a table.
     */
    public static GetVariable GET_VARIABLE(
          Field<Integer> _DatasetId
        , Field<String[]> _VariableName
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
              _DatasetId
            , _VariableName
            , _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.grid_definition</code>.
     */
    public static final GridDefinition GRID_DEFINITION = GridDefinition.GRID_DEFINITION;

    /**
     * The table <code>data.health_impact_function</code>.
     */
    public static final HealthImpactFunction HEALTH_IMPACT_FUNCTION = HealthImpactFunction.HEALTH_IMPACT_FUNCTION;

    /**
     * The table <code>data.health_impact_function_dataset</code>.
     */
    public static final HealthImpactFunctionDataset HEALTH_IMPACT_FUNCTION_DATASET = HealthImpactFunctionDataset.HEALTH_IMPACT_FUNCTION_DATASET;

    /**
     * The table <code>data.health_impact_function_group</code>.
     */
    public static final HealthImpactFunctionGroup HEALTH_IMPACT_FUNCTION_GROUP = HealthImpactFunctionGroup.HEALTH_IMPACT_FUNCTION_GROUP;

    /**
     * The table <code>data.health_impact_function_group_member</code>.
     */
    public static final HealthImpactFunctionGroupMember HEALTH_IMPACT_FUNCTION_GROUP_MEMBER = HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER;

    /**
     * The table <code>data.hif_result</code>.
     */
    public static final HifResult HIF_RESULT = HifResult.HIF_RESULT;

    /**
     * The table <code>data.hif_result_dataset</code>.
     */
    public static final HifResultDataset HIF_RESULT_DATASET = HifResultDataset.HIF_RESULT_DATASET;

    /**
     * The table <code>data.hif_result_function_config</code>.
     */
    public static final HifResultFunctionConfig HIF_RESULT_FUNCTION_CONFIG = HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG;

    /**
     * The table <code>data.incidence_dataset</code>.
     */
    public static final IncidenceDataset INCIDENCE_DATASET = IncidenceDataset.INCIDENCE_DATASET;

    /**
     * The table <code>data.incidence_entry</code>.
     */
    public static final IncidenceEntry INCIDENCE_ENTRY = IncidenceEntry.INCIDENCE_ENTRY;

    /**
     * The table <code>data.incidence_value</code>.
     */
    public static final IncidenceValue INCIDENCE_VALUE = IncidenceValue.INCIDENCE_VALUE;

    /**
     * The table <code>data.income_growth_adj_dataset</code>.
     */
    public static final IncomeGrowthAdjDataset INCOME_GROWTH_ADJ_DATASET = IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET;

    /**
     * The table <code>data.income_growth_adj_factor</code>.
     */
    public static final IncomeGrowthAdjFactor INCOME_GROWTH_ADJ_FACTOR = IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR;

    /**
     * The table <code>data.inflation_dataset</code>.
     */
    public static final InflationDataset INFLATION_DATASET = InflationDataset.INFLATION_DATASET;

    /**
     * The table <code>data.inflation_entry</code>.
     */
    public static final InflationEntry INFLATION_ENTRY = InflationEntry.INFLATION_ENTRY;

    /**
     * The table <code>data.pollutant</code>.
     */
    public static final Pollutant POLLUTANT = Pollutant.POLLUTANT;

    /**
     * The table <code>data.pollutant_metric</code>.
     */
    public static final PollutantMetric POLLUTANT_METRIC = PollutantMetric.POLLUTANT_METRIC;

    /**
     * The table <code>data.pop_config</code>.
     */
    public static final PopConfig POP_CONFIG = PopConfig.POP_CONFIG;

    /**
     * The table <code>data.pop_config_ethnicity</code>.
     */
    public static final PopConfigEthnicity POP_CONFIG_ETHNICITY = PopConfigEthnicity.POP_CONFIG_ETHNICITY;

    /**
     * The table <code>data.pop_config_gender</code>.
     */
    public static final PopConfigGender POP_CONFIG_GENDER = PopConfigGender.POP_CONFIG_GENDER;

    /**
     * The table <code>data.pop_config_race</code>.
     */
    public static final PopConfigRace POP_CONFIG_RACE = PopConfigRace.POP_CONFIG_RACE;

    /**
     * The table <code>data.population_dataset</code>.
     */
    public static final PopulationDataset POPULATION_DATASET = PopulationDataset.POPULATION_DATASET;

    /**
     * The table <code>data.population_entry</code>.
     */
    public static final PopulationEntry POPULATION_ENTRY = PopulationEntry.POPULATION_ENTRY;

    /**
     * The table <code>data.population_year</code>.
     */
    public static final PopulationYear POPULATION_YEAR = PopulationYear.POPULATION_YEAR;

    /**
     * The table <code>data.race</code>.
     */
    public static final Race RACE = Race.RACE;

    /**
     * The table <code>data.seasonal_metric</code>.
     */
    public static final SeasonalMetric SEASONAL_METRIC = SeasonalMetric.SEASONAL_METRIC;

    /**
     * The table <code>data.seasonal_metric_season</code>.
     */
    public static final SeasonalMetricSeason SEASONAL_METRIC_SEASON = SeasonalMetricSeason.SEASONAL_METRIC_SEASON;

    /**
     * The table <code>data.task_complete</code>.
     */
    public static final TaskComplete TASK_COMPLETE = TaskComplete.TASK_COMPLETE;

    /**
     * The table <code>data.task_queue</code>.
     */
    public static final TaskQueue TASK_QUEUE = TaskQueue.TASK_QUEUE;

    /**
     * The table <code>data.task_worker</code>.
     */
    public static final TaskWorker TASK_WORKER = TaskWorker.TASK_WORKER;

    /**
     * The table <code>data.valuation_function</code>.
     */
    public static final ValuationFunction VALUATION_FUNCTION = ValuationFunction.VALUATION_FUNCTION;

    /**
     * The table <code>data.valuation_function_dataset</code>.
     */
    public static final ValuationFunctionDataset VALUATION_FUNCTION_DATASET = ValuationFunctionDataset.VALUATION_FUNCTION_DATASET;

    /**
     * The table <code>data.valuation_result</code>.
     */
    public static final ValuationResult VALUATION_RESULT = ValuationResult.VALUATION_RESULT;

    /**
     * The table <code>data.valuation_result_dataset</code>.
     */
    public static final ValuationResultDataset VALUATION_RESULT_DATASET = ValuationResultDataset.VALUATION_RESULT_DATASET;

    /**
     * The table <code>data.valuation_result_function_config</code>.
     */
    public static final ValuationResultFunctionConfig VALUATION_RESULT_FUNCTION_CONFIG = ValuationResultFunctionConfig.VALUATION_RESULT_FUNCTION_CONFIG;

    /**
     * The table <code>data.variable_dataset</code>.
     */
    public static final VariableDataset VARIABLE_DATASET = VariableDataset.VARIABLE_DATASET;

    /**
     * The table <code>data.variable_entry</code>.
     */
    public static final VariableEntry VARIABLE_ENTRY = VariableEntry.VARIABLE_ENTRY;

    /**
     * The table <code>data.variable_value</code>.
     */
    public static final VariableValue VARIABLE_VALUE = VariableValue.VARIABLE_VALUE;
}