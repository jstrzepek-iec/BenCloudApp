/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids.tables;


import gov.epa.bencloud.server.database.jooq.grids.Grids;
import gov.epa.bencloud.server.database.jooq.grids.Indexes;
import gov.epa.bencloud.server.database.jooq.grids.Keys;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsStateRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class UsState extends TableImpl<UsStateRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>grids.us_state</code>
     */
    public static final UsState US_STATE = new UsState();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsStateRecord> getRecordType() {
        return UsStateRecord.class;
    }

    /**
     * The column <code>grids.us_state.gid</code>.
     */
    public final TableField<UsStateRecord, Integer> GID = createField(DSL.name("gid"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>grids.us_state.state_name</code>.
     */
    public final TableField<UsStateRecord, String> STATE_NAME = createField(DSL.name("state_name"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>grids.us_state.state_fips</code>.
     */
    public final TableField<UsStateRecord, String> STATE_FIPS = createField(DSL.name("state_fips"), SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>grids.us_state.col</code>.
     */
    public final TableField<UsStateRecord, Short> COL = createField(DSL.name("col"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>grids.us_state.row</code>.
     */
    public final TableField<UsStateRecord, Short> ROW = createField(DSL.name("row"), SQLDataType.SMALLINT, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public final TableField<UsStateRecord, Object> GEOM = createField(DSL.name("geom"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), this, "");

    private UsState(Name alias, Table<UsStateRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsState(Name alias, Table<UsStateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>grids.us_state</code> table reference
     */
    public UsState(String alias) {
        this(DSL.name(alias), US_STATE);
    }

    /**
     * Create an aliased <code>grids.us_state</code> table reference
     */
    public UsState(Name alias) {
        this(alias, US_STATE);
    }

    /**
     * Create a <code>grids.us_state</code> table reference
     */
    public UsState() {
        this(DSL.name("us_state"), null);
    }

    public <O extends Record> UsState(Table<O> child, ForeignKey<O, UsStateRecord> key) {
        super(child, key, US_STATE);
    }

    @Override
    public Schema getSchema() {
        return Grids.GRIDS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.US_STATE_GEOM_IDX);
    }

    @Override
    public Identity<UsStateRecord, Integer> getIdentity() {
        return (Identity<UsStateRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsStateRecord> getPrimaryKey() {
        return Keys.US_STATE_PKEY;
    }

    @Override
    public List<UniqueKey<UsStateRecord>> getKeys() {
        return Arrays.<UniqueKey<UsStateRecord>>asList(Keys.US_STATE_PKEY);
    }

    @Override
    public UsState as(String alias) {
        return new UsState(DSL.name(alias), this);
    }

    @Override
    public UsState as(Name alias) {
        return new UsState(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsState rename(String name) {
        return new UsState(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsState rename(Name name) {
        return new UsState(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Short, Short, Object> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
