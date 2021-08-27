/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids.tables.records;


import gov.epa.bencloud.server.database.jooq.grids.tables.UsNation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsNationRecord extends UpdatableRecordImpl<UsNationRecord> implements Record4<Integer, Short, Short, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>grids.us_nation.gid</code>.
     */
    public void setGid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>grids.us_nation.gid</code>.
     */
    public Integer getGid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>grids.us_nation.col</code>.
     */
    public void setCol(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>grids.us_nation.col</code>.
     */
    public Short getCol() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>grids.us_nation.row</code>.
     */
    public void setRow(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>grids.us_nation.row</code>.
     */
    public Short getRow() {
        return (Short) get(2);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public void setGeom(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    public Object getGeom() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, Short, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Short, Short, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UsNation.US_NATION.GID;
    }

    @Override
    public Field<Short> field2() {
        return UsNation.US_NATION.COL;
    }

    @Override
    public Field<Short> field3() {
        return UsNation.US_NATION.ROW;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field4() {
        return UsNation.US_NATION.GEOM;
    }

    @Override
    public Integer component1() {
        return getGid();
    }

    @Override
    public Short component2() {
        return getCol();
    }

    @Override
    public Short component3() {
        return getRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    @Override
    public Object component4() {
        return getGeom();
    }

    @Override
    public Integer value1() {
        return getGid();
    }

    @Override
    public Short value2() {
        return getCol();
    }

    @Override
    public Short value3() {
        return getRow();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    @Override
    public Object value4() {
        return getGeom();
    }

    @Override
    public UsNationRecord value1(Integer value) {
        setGid(value);
        return this;
    }

    @Override
    public UsNationRecord value2(Short value) {
        setCol(value);
        return this;
    }

    @Override
    public UsNationRecord value3(Short value) {
        setRow(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @Deprecated
    @Override
    public UsNationRecord value4(Object value) {
        setGeom(value);
        return this;
    }

    @Override
    public UsNationRecord values(Integer value1, Short value2, Short value3, Object value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsNationRecord
     */
    public UsNationRecord() {
        super(UsNation.US_NATION);
    }

    /**
     * Create a detached, initialised UsNationRecord
     */
    public UsNationRecord(Integer gid, Short col, Short row, Object geom) {
        super(UsNation.US_NATION);

        setGid(gid);
        setCol(col);
        setRow(row);
        setGeom(geom);
    }
}
