/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables.records;


import gov.epa.bencloud.server.database.jooq.tables.ValuationResult;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValuationResultRecord extends TableRecordImpl<ValuationResultRecord> implements Record13<Integer, Integer, Integer, Integer, Integer, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.valuation_result.valuation_result_dataset_id</code>.
     */
    public void setValuationResultDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.valuation_result.valuation_result_dataset_id</code>.
     */
    public Integer getValuationResultDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.valuation_result.vf_id</code>.
     */
    public void setVfId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.valuation_result.vf_id</code>.
     */
    public Integer getVfId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.valuation_result.hif_id</code>.
     */
    public void setHifId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.valuation_result.hif_id</code>.
     */
    public Integer getHifId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.valuation_result.grid_col</code>.
     */
    public void setGridCol(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_col</code>.
     */
    public Integer getGridCol() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.valuation_result.grid_row</code>.
     */
    public void setGridRow(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_row</code>.
     */
    public Integer getGridRow() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.valuation_result.grid_cell_id</code>.
     */
    public void setGridCellId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_cell_id</code>.
     */
    public Long getGridCellId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>data.valuation_result.population</code>.
     */
    public void setPopulation(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.valuation_result.population</code>.
     */
    public BigDecimal getPopulation() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>data.valuation_result.result</code>.
     */
    public void setResult(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.valuation_result.result</code>.
     */
    public BigDecimal getResult() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>data.valuation_result.result_mean</code>.
     */
    public void setResultMean(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.valuation_result.result_mean</code>.
     */
    public BigDecimal getResultMean() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>data.valuation_result.standard_dev</code>.
     */
    public void setStandardDev(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.valuation_result.standard_dev</code>.
     */
    public BigDecimal getStandardDev() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>data.valuation_result.result_variance</code>.
     */
    public void setResultVariance(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.valuation_result.result_variance</code>.
     */
    public BigDecimal getResultVariance() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>data.valuation_result.pct2_5</code>.
     */
    public void setPct2_5(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.valuation_result.pct2_5</code>.
     */
    public BigDecimal getPct2_5() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>data.valuation_result.pct97_5</code>.
     */
    public void setPct97_5(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.valuation_result.pct97_5</code>.
     */
    public BigDecimal getPct97_5() {
        return (BigDecimal) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, Integer, Integer, Integer, Integer, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, Integer, Integer, Integer, Integer, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ValuationResult.VALUATION_RESULT.VALUATION_RESULT_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ValuationResult.VALUATION_RESULT.VF_ID;
    }

    @Override
    public Field<Integer> field3() {
        return ValuationResult.VALUATION_RESULT.HIF_ID;
    }

    @Override
    public Field<Integer> field4() {
        return ValuationResult.VALUATION_RESULT.GRID_COL;
    }

    @Override
    public Field<Integer> field5() {
        return ValuationResult.VALUATION_RESULT.GRID_ROW;
    }

    @Override
    public Field<Long> field6() {
        return ValuationResult.VALUATION_RESULT.GRID_CELL_ID;
    }

    @Override
    public Field<BigDecimal> field7() {
        return ValuationResult.VALUATION_RESULT.POPULATION;
    }

    @Override
    public Field<BigDecimal> field8() {
        return ValuationResult.VALUATION_RESULT.RESULT;
    }

    @Override
    public Field<BigDecimal> field9() {
        return ValuationResult.VALUATION_RESULT.RESULT_MEAN;
    }

    @Override
    public Field<BigDecimal> field10() {
        return ValuationResult.VALUATION_RESULT.STANDARD_DEV;
    }

    @Override
    public Field<BigDecimal> field11() {
        return ValuationResult.VALUATION_RESULT.RESULT_VARIANCE;
    }

    @Override
    public Field<BigDecimal> field12() {
        return ValuationResult.VALUATION_RESULT.PCT2_5;
    }

    @Override
    public Field<BigDecimal> field13() {
        return ValuationResult.VALUATION_RESULT.PCT97_5;
    }

    @Override
    public Integer component1() {
        return getValuationResultDatasetId();
    }

    @Override
    public Integer component2() {
        return getVfId();
    }

    @Override
    public Integer component3() {
        return getHifId();
    }

    @Override
    public Integer component4() {
        return getGridCol();
    }

    @Override
    public Integer component5() {
        return getGridRow();
    }

    @Override
    public Long component6() {
        return getGridCellId();
    }

    @Override
    public BigDecimal component7() {
        return getPopulation();
    }

    @Override
    public BigDecimal component8() {
        return getResult();
    }

    @Override
    public BigDecimal component9() {
        return getResultMean();
    }

    @Override
    public BigDecimal component10() {
        return getStandardDev();
    }

    @Override
    public BigDecimal component11() {
        return getResultVariance();
    }

    @Override
    public BigDecimal component12() {
        return getPct2_5();
    }

    @Override
    public BigDecimal component13() {
        return getPct97_5();
    }

    @Override
    public Integer value1() {
        return getValuationResultDatasetId();
    }

    @Override
    public Integer value2() {
        return getVfId();
    }

    @Override
    public Integer value3() {
        return getHifId();
    }

    @Override
    public Integer value4() {
        return getGridCol();
    }

    @Override
    public Integer value5() {
        return getGridRow();
    }

    @Override
    public Long value6() {
        return getGridCellId();
    }

    @Override
    public BigDecimal value7() {
        return getPopulation();
    }

    @Override
    public BigDecimal value8() {
        return getResult();
    }

    @Override
    public BigDecimal value9() {
        return getResultMean();
    }

    @Override
    public BigDecimal value10() {
        return getStandardDev();
    }

    @Override
    public BigDecimal value11() {
        return getResultVariance();
    }

    @Override
    public BigDecimal value12() {
        return getPct2_5();
    }

    @Override
    public BigDecimal value13() {
        return getPct97_5();
    }

    @Override
    public ValuationResultRecord value1(Integer value) {
        setValuationResultDatasetId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value2(Integer value) {
        setVfId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value3(Integer value) {
        setHifId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value4(Integer value) {
        setGridCol(value);
        return this;
    }

    @Override
    public ValuationResultRecord value5(Integer value) {
        setGridRow(value);
        return this;
    }

    @Override
    public ValuationResultRecord value6(Long value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value7(BigDecimal value) {
        setPopulation(value);
        return this;
    }

    @Override
    public ValuationResultRecord value8(BigDecimal value) {
        setResult(value);
        return this;
    }

    @Override
    public ValuationResultRecord value9(BigDecimal value) {
        setResultMean(value);
        return this;
    }

    @Override
    public ValuationResultRecord value10(BigDecimal value) {
        setStandardDev(value);
        return this;
    }

    @Override
    public ValuationResultRecord value11(BigDecimal value) {
        setResultVariance(value);
        return this;
    }

    @Override
    public ValuationResultRecord value12(BigDecimal value) {
        setPct2_5(value);
        return this;
    }

    @Override
    public ValuationResultRecord value13(BigDecimal value) {
        setPct97_5(value);
        return this;
    }

    @Override
    public ValuationResultRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Long value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ValuationResultRecord
     */
    public ValuationResultRecord() {
        super(ValuationResult.VALUATION_RESULT);
    }

    /**
     * Create a detached, initialised ValuationResultRecord
     */
    public ValuationResultRecord(Integer valuationResultDatasetId, Integer vfId, Integer hifId, Integer gridCol, Integer gridRow, Long gridCellId, BigDecimal population, BigDecimal result, BigDecimal resultMean, BigDecimal standardDev, BigDecimal resultVariance, BigDecimal pct2_5, BigDecimal pct97_5) {
        super(ValuationResult.VALUATION_RESULT);

        setValuationResultDatasetId(valuationResultDatasetId);
        setVfId(vfId);
        setHifId(hifId);
        setGridCol(gridCol);
        setGridRow(gridRow);
        setGridCellId(gridCellId);
        setPopulation(population);
        setResult(result);
        setResultMean(resultMean);
        setStandardDev(standardDev);
        setResultVariance(resultVariance);
        setPct2_5(pct2_5);
        setPct97_5(pct97_5);
    }
}
