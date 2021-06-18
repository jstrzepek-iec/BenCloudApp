/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.InflationDatasetRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InflationDataset extends TableImpl<InflationDatasetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.inflation_dataset</code>
     */
    public static final InflationDataset INFLATION_DATASET = new InflationDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InflationDatasetRecord> getRecordType() {
        return InflationDatasetRecord.class;
    }

    /**
     * The column <code>data.inflation_dataset.id</code>.
     */
    public final TableField<InflationDatasetRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.inflation_dataset.name</code>.
     */
    public final TableField<InflationDatasetRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    private InflationDataset(Name alias, Table<InflationDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private InflationDataset(Name alias, Table<InflationDatasetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.inflation_dataset</code> table reference
     */
    public InflationDataset(String alias) {
        this(DSL.name(alias), INFLATION_DATASET);
    }

    /**
     * Create an aliased <code>data.inflation_dataset</code> table reference
     */
    public InflationDataset(Name alias) {
        this(alias, INFLATION_DATASET);
    }

    /**
     * Create a <code>data.inflation_dataset</code> table reference
     */
    public InflationDataset() {
        this(DSL.name("inflation_dataset"), null);
    }

    public <O extends Record> InflationDataset(Table<O> child, ForeignKey<O, InflationDatasetRecord> key) {
        super(child, key, INFLATION_DATASET);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<InflationDatasetRecord, Integer> getIdentity() {
        return (Identity<InflationDatasetRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<InflationDatasetRecord> getPrimaryKey() {
        return Keys.INFLATION_DATASET_PKEY;
    }

    @Override
    public List<UniqueKey<InflationDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<InflationDatasetRecord>>asList(Keys.INFLATION_DATASET_PKEY);
    }

    @Override
    public InflationDataset as(String alias) {
        return new InflationDataset(DSL.name(alias), this);
    }

    @Override
    public InflationDataset as(Name alias) {
        return new InflationDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InflationDataset rename(String name) {
        return new InflationDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InflationDataset rename(Name name) {
        return new InflationDataset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
