/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.VariableEntryRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class VariableEntry extends TableImpl<VariableEntryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.variable_entry</code>
     */
    public static final VariableEntry VARIABLE_ENTRY = new VariableEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariableEntryRecord> getRecordType() {
        return VariableEntryRecord.class;
    }

    /**
     * The column <code>data.variable_entry.id</code>.
     */
    public final TableField<VariableEntryRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.variable_entry.variable_dataset_id</code>.
     */
    public final TableField<VariableEntryRecord, Integer> VARIABLE_DATASET_ID = createField(DSL.name("variable_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.variable_entry.name</code>.
     */
    public final TableField<VariableEntryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>data.variable_entry.grid_definition_id</code>.
     */
    public final TableField<VariableEntryRecord, Integer> GRID_DEFINITION_ID = createField(DSL.name("grid_definition_id"), SQLDataType.INTEGER, this, "");

    private VariableEntry(Name alias, Table<VariableEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariableEntry(Name alias, Table<VariableEntryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.variable_entry</code> table reference
     */
    public VariableEntry(String alias) {
        this(DSL.name(alias), VARIABLE_ENTRY);
    }

    /**
     * Create an aliased <code>data.variable_entry</code> table reference
     */
    public VariableEntry(Name alias) {
        this(alias, VARIABLE_ENTRY);
    }

    /**
     * Create a <code>data.variable_entry</code> table reference
     */
    public VariableEntry() {
        this(DSL.name("variable_entry"), null);
    }

    public <O extends Record> VariableEntry(Table<O> child, ForeignKey<O, VariableEntryRecord> key) {
        super(child, key, VARIABLE_ENTRY);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<VariableEntryRecord, Integer> getIdentity() {
        return (Identity<VariableEntryRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<VariableEntryRecord> getPrimaryKey() {
        return Keys.VARIABLE_ENTRY_PKEY;
    }

    @Override
    public List<UniqueKey<VariableEntryRecord>> getKeys() {
        return Arrays.<UniqueKey<VariableEntryRecord>>asList(Keys.VARIABLE_ENTRY_PKEY);
    }

    @Override
    public VariableEntry as(String alias) {
        return new VariableEntry(DSL.name(alias), this);
    }

    @Override
    public VariableEntry as(Name alias) {
        return new VariableEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariableEntry rename(String name) {
        return new VariableEntry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariableEntry rename(Name name) {
        return new VariableEntry(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
