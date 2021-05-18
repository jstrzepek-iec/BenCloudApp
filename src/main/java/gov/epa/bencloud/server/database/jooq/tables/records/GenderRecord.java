/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables.records;


import gov.epa.bencloud.server.database.jooq.tables.Gender;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenderRecord extends UpdatableRecordImpl<GenderRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.gender.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.gender.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.gender.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.gender.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Gender.GENDER.ID;
    }

    @Override
    public Field<String> field2() {
        return Gender.GENDER.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public GenderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GenderRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GenderRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GenderRecord
     */
    public GenderRecord() {
        super(Gender.GENDER);
    }

    /**
     * Create a detached, initialised GenderRecord
     */
    public GenderRecord(Integer id, String name) {
        super(Gender.GENDER);

        setId(id);
        setName(name);
    }
}
