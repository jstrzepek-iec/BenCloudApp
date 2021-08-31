/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.PopulationYear;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationYearRecord extends TableRecordImpl<PopulationYearRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.population_year.population_dataset_id</code>.
     */
    public void setPopulationDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.population_year.population_dataset_id</code>.
     */
    public Integer getPopulationDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.population_year.pop_year</code>.
     */
    public void setPopYear(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.population_year.pop_year</code>.
     */
    public Integer getPopYear() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PopulationYear.POPULATION_YEAR.POPULATION_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return PopulationYear.POPULATION_YEAR.POP_YEAR;
    }

    @Override
    public Integer component1() {
        return getPopulationDatasetId();
    }

    @Override
    public Integer component2() {
        return getPopYear();
    }

    @Override
    public Integer value1() {
        return getPopulationDatasetId();
    }

    @Override
    public Integer value2() {
        return getPopYear();
    }

    @Override
    public PopulationYearRecord value1(Integer value) {
        setPopulationDatasetId(value);
        return this;
    }

    @Override
    public PopulationYearRecord value2(Integer value) {
        setPopYear(value);
        return this;
    }

    @Override
    public PopulationYearRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PopulationYearRecord
     */
    public PopulationYearRecord() {
        super(PopulationYear.POPULATION_YEAR);
    }

    /**
     * Create a detached, initialised PopulationYearRecord
     */
    public PopulationYearRecord(Integer populationDatasetId, Integer popYear) {
        super(PopulationYear.POPULATION_YEAR);

        setPopulationDatasetId(populationDatasetId);
        setPopYear(popYear);
    }
}