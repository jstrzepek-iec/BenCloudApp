/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.EthnicityRecord;

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
public class Ethnicity extends TableImpl<EthnicityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.ethnicity</code>
     */
    public static final Ethnicity ETHNICITY = new Ethnicity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EthnicityRecord> getRecordType() {
        return EthnicityRecord.class;
    }

    /**
     * The column <code>data.ethnicity.id</code>.
     */
    public final TableField<EthnicityRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.ethnicity.name</code>.
     */
    public final TableField<EthnicityRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    private Ethnicity(Name alias, Table<EthnicityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ethnicity(Name alias, Table<EthnicityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.ethnicity</code> table reference
     */
    public Ethnicity(String alias) {
        this(DSL.name(alias), ETHNICITY);
    }

    /**
     * Create an aliased <code>data.ethnicity</code> table reference
     */
    public Ethnicity(Name alias) {
        this(alias, ETHNICITY);
    }

    /**
     * Create a <code>data.ethnicity</code> table reference
     */
    public Ethnicity() {
        this(DSL.name("ethnicity"), null);
    }

    public <O extends Record> Ethnicity(Table<O> child, ForeignKey<O, EthnicityRecord> key) {
        super(child, key, ETHNICITY);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<EthnicityRecord, Integer> getIdentity() {
        return (Identity<EthnicityRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<EthnicityRecord> getPrimaryKey() {
        return Keys.ETHNICITY_PKEY;
    }

    @Override
    public List<UniqueKey<EthnicityRecord>> getKeys() {
        return Arrays.<UniqueKey<EthnicityRecord>>asList(Keys.ETHNICITY_PKEY);
    }

    @Override
    public Ethnicity as(String alias) {
        return new Ethnicity(DSL.name(alias), this);
    }

    @Override
    public Ethnicity as(Name alias) {
        return new Ethnicity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ethnicity rename(String name) {
        return new Ethnicity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ethnicity rename(Name name) {
        return new Ethnicity(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
