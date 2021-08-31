/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.Pollutant;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PollutantRecord extends UpdatableRecordImpl<PollutantRecord> implements Record5<Integer, String, Short, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.pollutant.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.pollutant.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.pollutant.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.pollutant.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.pollutant.observation_type</code>.
     */
    public void setObservationType(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.pollutant.observation_type</code>.
     */
    public Short getObservationType() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>data.pollutant.friendly_name</code>.
     */
    public void setFriendlyName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.pollutant.friendly_name</code>.
     */
    public String getFriendlyName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>data.pollutant.help_text</code>.
     */
    public void setHelpText(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.pollutant.help_text</code>.
     */
    public String getHelpText() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Short, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, Short, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Pollutant.POLLUTANT.ID;
    }

    @Override
    public Field<String> field2() {
        return Pollutant.POLLUTANT.NAME;
    }

    @Override
    public Field<Short> field3() {
        return Pollutant.POLLUTANT.OBSERVATION_TYPE;
    }

    @Override
    public Field<String> field4() {
        return Pollutant.POLLUTANT.FRIENDLY_NAME;
    }

    @Override
    public Field<String> field5() {
        return Pollutant.POLLUTANT.HELP_TEXT;
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
    public Short component3() {
        return getObservationType();
    }

    @Override
    public String component4() {
        return getFriendlyName();
    }

    @Override
    public String component5() {
        return getHelpText();
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
    public Short value3() {
        return getObservationType();
    }

    @Override
    public String value4() {
        return getFriendlyName();
    }

    @Override
    public String value5() {
        return getHelpText();
    }

    @Override
    public PollutantRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PollutantRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PollutantRecord value3(Short value) {
        setObservationType(value);
        return this;
    }

    @Override
    public PollutantRecord value4(String value) {
        setFriendlyName(value);
        return this;
    }

    @Override
    public PollutantRecord value5(String value) {
        setHelpText(value);
        return this;
    }

    @Override
    public PollutantRecord values(Integer value1, String value2, Short value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PollutantRecord
     */
    public PollutantRecord() {
        super(Pollutant.POLLUTANT);
    }

    /**
     * Create a detached, initialised PollutantRecord
     */
    public PollutantRecord(Integer id, String name, Short observationType, String friendlyName, String helpText) {
        super(Pollutant.POLLUTANT);

        setId(id);
        setName(name);
        setObservationType(observationType);
        setFriendlyName(friendlyName);
        setHelpText(helpText);
    }
}
