/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables.records;


import gov.epa.bencloud.server.database.jooq.tables.GetPopulation;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetPopulationRecord extends TableRecordImpl<GetPopulationRecord> implements Record6<Long, Integer, Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.get_population.grid_cell_id</code>.
     */
    public void setGridCellId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.get_population.grid_cell_id</code>.
     */
    public Long getGridCellId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>data.get_population.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.get_population.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.get_population.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.get_population.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.get_population.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.get_population.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.get_population.age_range_id</code>.
     */
    public void setAgeRangeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.get_population.age_range_id</code>.
     */
    public Integer getAgeRangeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.get_population.pop_value</code>.
     */
    public void setPopValue(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.get_population.pop_value</code>.
     */
    public BigDecimal getPopValue() {
        return (BigDecimal) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Integer, Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return GetPopulation.GET_POPULATION.GRID_CELL_ID;
    }

    @Override
    public Field<Integer> field2() {
        return GetPopulation.GET_POPULATION.RACE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return GetPopulation.GET_POPULATION.ETHNICITY_ID;
    }

    @Override
    public Field<Integer> field4() {
        return GetPopulation.GET_POPULATION.GENDER_ID;
    }

    @Override
    public Field<Integer> field5() {
        return GetPopulation.GET_POPULATION.AGE_RANGE_ID;
    }

    @Override
    public Field<BigDecimal> field6() {
        return GetPopulation.GET_POPULATION.POP_VALUE;
    }

    @Override
    public Long component1() {
        return getGridCellId();
    }

    @Override
    public Integer component2() {
        return getRaceId();
    }

    @Override
    public Integer component3() {
        return getEthnicityId();
    }

    @Override
    public Integer component4() {
        return getGenderId();
    }

    @Override
    public Integer component5() {
        return getAgeRangeId();
    }

    @Override
    public BigDecimal component6() {
        return getPopValue();
    }

    @Override
    public Long value1() {
        return getGridCellId();
    }

    @Override
    public Integer value2() {
        return getRaceId();
    }

    @Override
    public Integer value3() {
        return getEthnicityId();
    }

    @Override
    public Integer value4() {
        return getGenderId();
    }

    @Override
    public Integer value5() {
        return getAgeRangeId();
    }

    @Override
    public BigDecimal value6() {
        return getPopValue();
    }

    @Override
    public GetPopulationRecord value1(Long value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public GetPopulationRecord value2(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public GetPopulationRecord value3(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public GetPopulationRecord value4(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public GetPopulationRecord value5(Integer value) {
        setAgeRangeId(value);
        return this;
    }

    @Override
    public GetPopulationRecord value6(BigDecimal value) {
        setPopValue(value);
        return this;
    }

    @Override
    public GetPopulationRecord values(Long value1, Integer value2, Integer value3, Integer value4, Integer value5, BigDecimal value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetPopulationRecord
     */
    public GetPopulationRecord() {
        super(GetPopulation.GET_POPULATION);
    }

    /**
     * Create a detached, initialised GetPopulationRecord
     */
    public GetPopulationRecord(Long gridCellId, Integer raceId, Integer ethnicityId, Integer genderId, Integer ageRangeId, BigDecimal popValue) {
        super(GetPopulation.GET_POPULATION);

        setGridCellId(gridCellId);
        setRaceId(raceId);
        setEthnicityId(ethnicityId);
        setGenderId(genderId);
        setAgeRangeId(ageRangeId);
        setPopValue(popValue);
    }
}
