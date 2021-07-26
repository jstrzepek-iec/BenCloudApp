/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.tables.records.ValuationResultRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValuationResult extends TableImpl<ValuationResultRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.valuation_result</code>
     */
    public static final ValuationResult VALUATION_RESULT = new ValuationResult();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValuationResultRecord> getRecordType() {
        return ValuationResultRecord.class;
    }

    /**
     * The column <code>data.valuation_result.valuation_result_dataset_id</code>.
     */
    public final TableField<ValuationResultRecord, Integer> VALUATION_RESULT_DATASET_ID = createField(DSL.name("valuation_result_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result.vf_id</code>.
     */
    public final TableField<ValuationResultRecord, Integer> VF_ID = createField(DSL.name("vf_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result.hif_id</code>.
     */
    public final TableField<ValuationResultRecord, Integer> HIF_ID = createField(DSL.name("hif_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result.grid_col</code>.
     */
    public final TableField<ValuationResultRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result.grid_row</code>.
     */
    public final TableField<ValuationResultRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result.grid_cell_id</code>.
     */
    public final TableField<ValuationResultRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.valuation_result.population</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> POPULATION = createField(DSL.name("population"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.result</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> RESULT = createField(DSL.name("result"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.result_mean</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> RESULT_MEAN = createField(DSL.name("result_mean"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.standard_dev</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> STANDARD_DEV = createField(DSL.name("standard_dev"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.result_variance</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> RESULT_VARIANCE = createField(DSL.name("result_variance"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.pct_2_5</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> PCT_2_5 = createField(DSL.name("pct_2_5"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.pct_97_5</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal> PCT_97_5 = createField(DSL.name("pct_97_5"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.valuation_result.percentiles</code>.
     */
    public final TableField<ValuationResultRecord, BigDecimal[]> PERCENTILES = createField(DSL.name("percentiles"), SQLDataType.NUMERIC.getArrayDataType(), this, "");

    private ValuationResult(Name alias, Table<ValuationResultRecord> aliased) {
        this(alias, aliased, null);
    }

    private ValuationResult(Name alias, Table<ValuationResultRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.valuation_result</code> table reference
     */
    public ValuationResult(String alias) {
        this(DSL.name(alias), VALUATION_RESULT);
    }

    /**
     * Create an aliased <code>data.valuation_result</code> table reference
     */
    public ValuationResult(Name alias) {
        this(alias, VALUATION_RESULT);
    }

    /**
     * Create a <code>data.valuation_result</code> table reference
     */
    public ValuationResult() {
        this(DSL.name("valuation_result"), null);
    }

    public <O extends Record> ValuationResult(Table<O> child, ForeignKey<O, ValuationResultRecord> key) {
        super(child, key, VALUATION_RESULT);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public ValuationResult as(String alias) {
        return new ValuationResult(DSL.name(alias), this);
    }

    @Override
    public ValuationResult as(Name alias) {
        return new ValuationResult(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ValuationResult rename(String name) {
        return new ValuationResult(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ValuationResult rename(Name name) {
        return new ValuationResult(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, Integer, Integer, Integer, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal[]> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
