/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables.records;


import gov.epa.bencloud.server.database.jooq.tables.GridDefinition;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GridDefinitionRecord extends UpdatableRecordImpl<GridDefinitionRecord> implements Record8<Integer, String, Integer, Integer, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.grid_definition.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.grid_definition.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.grid_definition.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.grid_definition.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.grid_definition.col_count</code>.
     */
    public void setColCount(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.grid_definition.col_count</code>.
     */
    public Integer getColCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.grid_definition.row_count</code>.
     */
    public void setRowCount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.grid_definition.row_count</code>.
     */
    public Integer getRowCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.grid_definition.is_admin_layer</code>.
     */
    public void setIsAdminLayer(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.grid_definition.is_admin_layer</code>.
     */
    public String getIsAdminLayer() {
        return (String) get(4);
    }

    /**
     * Setter for <code>data.grid_definition.draw_priority</code>.
     */
    public void setDrawPriority(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.grid_definition.draw_priority</code>.
     */
    public Integer getDrawPriority() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.grid_definition.outline_color</code>.
     */
    public void setOutlineColor(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.grid_definition.outline_color</code>.
     */
    public String getOutlineColor() {
        return (String) get(6);
    }

    /**
     * Setter for <code>data.grid_definition.table_name</code>.
     */
    public void setTableName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.grid_definition.table_name</code>.
     */
    public String getTableName() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, Integer, Integer, String, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, Integer, Integer, String, Integer, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GridDefinition.GRID_DEFINITION.ID;
    }

    @Override
    public Field<String> field2() {
        return GridDefinition.GRID_DEFINITION.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return GridDefinition.GRID_DEFINITION.COL_COUNT;
    }

    @Override
    public Field<Integer> field4() {
        return GridDefinition.GRID_DEFINITION.ROW_COUNT;
    }

    @Override
    public Field<String> field5() {
        return GridDefinition.GRID_DEFINITION.IS_ADMIN_LAYER;
    }

    @Override
    public Field<Integer> field6() {
        return GridDefinition.GRID_DEFINITION.DRAW_PRIORITY;
    }

    @Override
    public Field<String> field7() {
        return GridDefinition.GRID_DEFINITION.OUTLINE_COLOR;
    }

    @Override
    public Field<String> field8() {
        return GridDefinition.GRID_DEFINITION.TABLE_NAME;
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
    public Integer component3() {
        return getColCount();
    }

    @Override
    public Integer component4() {
        return getRowCount();
    }

    @Override
    public String component5() {
        return getIsAdminLayer();
    }

    @Override
    public Integer component6() {
        return getDrawPriority();
    }

    @Override
    public String component7() {
        return getOutlineColor();
    }

    @Override
    public String component8() {
        return getTableName();
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
    public Integer value3() {
        return getColCount();
    }

    @Override
    public Integer value4() {
        return getRowCount();
    }

    @Override
    public String value5() {
        return getIsAdminLayer();
    }

    @Override
    public Integer value6() {
        return getDrawPriority();
    }

    @Override
    public String value7() {
        return getOutlineColor();
    }

    @Override
    public String value8() {
        return getTableName();
    }

    @Override
    public GridDefinitionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value3(Integer value) {
        setColCount(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value4(Integer value) {
        setRowCount(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value5(String value) {
        setIsAdminLayer(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value6(Integer value) {
        setDrawPriority(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value7(String value) {
        setOutlineColor(value);
        return this;
    }

    @Override
    public GridDefinitionRecord value8(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public GridDefinitionRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Integer value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GridDefinitionRecord
     */
    public GridDefinitionRecord() {
        super(GridDefinition.GRID_DEFINITION);
    }

    /**
     * Create a detached, initialised GridDefinitionRecord
     */
    public GridDefinitionRecord(Integer id, String name, Integer colCount, Integer rowCount, String isAdminLayer, Integer drawPriority, String outlineColor, String tableName) {
        super(GridDefinition.GRID_DEFINITION);

        setId(id);
        setName(name);
        setColCount(colCount);
        setRowCount(rowCount);
        setIsAdminLayer(isAdminLayer);
        setDrawPriority(drawPriority);
        setOutlineColor(outlineColor);
        setTableName(tableName);
    }
}
