/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Indexes;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.IncidenceValueRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class IncidenceValue extends TableImpl<IncidenceValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.incidence_value</code>
     */
    public static final IncidenceValue INCIDENCE_VALUE = new IncidenceValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IncidenceValueRecord> getRecordType() {
        return IncidenceValueRecord.class;
    }

    /**
     * The column <code>data.incidence_value.incidence_entry_id</code>.
     */
    public final TableField<IncidenceValueRecord, Integer> INCIDENCE_ENTRY_ID = createField(DSL.name("incidence_entry_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.incidence_value.grid_cell_id</code>.
     */
    public final TableField<IncidenceValueRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.incidence_value.grid_col</code>.
     */
    public final TableField<IncidenceValueRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.incidence_value.grid_row</code>.
     */
    public final TableField<IncidenceValueRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.incidence_value.value</code>.
     */
    public final TableField<IncidenceValueRecord, BigDecimal> VALUE = createField(DSL.name("value"), SQLDataType.NUMERIC, this, "");

    private IncidenceValue(Name alias, Table<IncidenceValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private IncidenceValue(Name alias, Table<IncidenceValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.incidence_value</code> table reference
     */
    public IncidenceValue(String alias) {
        this(DSL.name(alias), INCIDENCE_VALUE);
    }

    /**
     * Create an aliased <code>data.incidence_value</code> table reference
     */
    public IncidenceValue(Name alias) {
        this(alias, INCIDENCE_VALUE);
    }

    /**
     * Create a <code>data.incidence_value</code> table reference
     */
    public IncidenceValue() {
        this(DSL.name("incidence_value"), null);
    }

    public <O extends Record> IncidenceValue(Table<O> child, ForeignKey<O, IncidenceValueRecord> key) {
        super(child, key, INCIDENCE_VALUE);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INCIDENCE_VALUE_INCIDENCE_ENTRY_ID_IDX);
    }

    @Override
    public List<ForeignKey<IncidenceValueRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<IncidenceValueRecord, ?>>asList(Keys.INCIDENCE_VALUE__INCIDENCE_VALUE_INCIDENCE_ENTRY_ID_FKEY);
    }

    private transient IncidenceEntry _incidenceEntry;

    public IncidenceEntry incidenceEntry() {
        if (_incidenceEntry == null)
            _incidenceEntry = new IncidenceEntry(this, Keys.INCIDENCE_VALUE__INCIDENCE_VALUE_INCIDENCE_ENTRY_ID_FKEY);

        return _incidenceEntry;
    }

    @Override
    public IncidenceValue as(String alias) {
        return new IncidenceValue(DSL.name(alias), this);
    }

    @Override
    public IncidenceValue as(Name alias) {
        return new IncidenceValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IncidenceValue rename(String name) {
        return new IncidenceValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IncidenceValue rename(Name name) {
        return new IncidenceValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Long, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
