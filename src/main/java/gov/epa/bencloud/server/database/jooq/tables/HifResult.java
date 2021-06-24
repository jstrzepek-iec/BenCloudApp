/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.tables.records.HifResultRecord;

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
public class HifResult extends TableImpl<HifResultRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.hif_result</code>
     */
    public static final HifResult HIF_RESULT = new HifResult();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HifResultRecord> getRecordType() {
        return HifResultRecord.class;
    }

    /**
     * The column <code>data.hif_result.hif_result_dataset_id</code>.
     */
    public final TableField<HifResultRecord, Integer> HIF_RESULT_DATASET_ID = createField(DSL.name("hif_result_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.hif_result.hif_id</code>.
     */
    public final TableField<HifResultRecord, Integer> HIF_ID = createField(DSL.name("hif_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.hif_result.grid_col</code>.
     */
    public final TableField<HifResultRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.hif_result.grid_row</code>.
     */
    public final TableField<HifResultRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.hif_result.grid_cell_id</code>.
     */
    public final TableField<HifResultRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.hif_result.population</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> POPULATION = createField(DSL.name("population"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.delta</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> DELTA = createField(DSL.name("delta"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.result</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> RESULT = createField(DSL.name("result"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.baseline</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> BASELINE = createField(DSL.name("baseline"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.result_mean</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> RESULT_MEAN = createField(DSL.name("result_mean"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.standard_dev</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> STANDARD_DEV = createField(DSL.name("standard_dev"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.result_variance</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> RESULT_VARIANCE = createField(DSL.name("result_variance"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.pct2_5</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> PCT2_5 = createField(DSL.name("pct2_5"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.hif_result.pct97_5</code>.
     */
    public final TableField<HifResultRecord, BigDecimal> PCT97_5 = createField(DSL.name("pct97_5"), SQLDataType.NUMERIC, this, "");

    private HifResult(Name alias, Table<HifResultRecord> aliased) {
        this(alias, aliased, null);
    }

    private HifResult(Name alias, Table<HifResultRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.hif_result</code> table reference
     */
    public HifResult(String alias) {
        this(DSL.name(alias), HIF_RESULT);
    }

    /**
     * Create an aliased <code>data.hif_result</code> table reference
     */
    public HifResult(Name alias) {
        this(alias, HIF_RESULT);
    }

    /**
     * Create a <code>data.hif_result</code> table reference
     */
    public HifResult() {
        this(DSL.name("hif_result"), null);
    }

    public <O extends Record> HifResult(Table<O> child, ForeignKey<O, HifResultRecord> key) {
        super(child, key, HIF_RESULT);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public HifResult as(String alias) {
        return new HifResult(DSL.name(alias), this);
    }

    @Override
    public HifResult as(Name alias) {
        return new HifResult(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HifResult rename(String name) {
        return new HifResult(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HifResult rename(Name name) {
        return new HifResult(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, Integer, Integer, Long, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
