/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.AirQualityCellRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class AirQualityCell extends TableImpl<AirQualityCellRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.air_quality_cell</code>
     */
    public static final AirQualityCell AIR_QUALITY_CELL = new AirQualityCell();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirQualityCellRecord> getRecordType() {
        return AirQualityCellRecord.class;
    }

    /**
     * The column <code>data.air_quality_cell.air_quality_layer_id</code>.
     */
    public final TableField<AirQualityCellRecord, Integer> AIR_QUALITY_LAYER_ID = createField(DSL.name("air_quality_layer_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_cell.grid_col</code>.
     */
    public final TableField<AirQualityCellRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_cell.grid_row</code>.
     */
    public final TableField<AirQualityCellRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_cell.grid_cell_id</code>.
     */
    public final TableField<AirQualityCellRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.air_quality_cell.metric_id</code>.
     */
    public final TableField<AirQualityCellRecord, Integer> METRIC_ID = createField(DSL.name("metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_cell.seasonal_metric_id</code>.
     */
    public final TableField<AirQualityCellRecord, Integer> SEASONAL_METRIC_ID = createField(DSL.name("seasonal_metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_cell.annual_metric</code>.
     */
    public final TableField<AirQualityCellRecord, String> ANNUAL_METRIC = createField(DSL.name("annual_metric"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.air_quality_cell.value</code>.
     */
    public final TableField<AirQualityCellRecord, BigDecimal> VALUE = createField(DSL.name("value"), SQLDataType.NUMERIC, this, "");

    private AirQualityCell(Name alias, Table<AirQualityCellRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirQualityCell(Name alias, Table<AirQualityCellRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.air_quality_cell</code> table reference
     */
    public AirQualityCell(String alias) {
        this(DSL.name(alias), AIR_QUALITY_CELL);
    }

    /**
     * Create an aliased <code>data.air_quality_cell</code> table reference
     */
    public AirQualityCell(Name alias) {
        this(alias, AIR_QUALITY_CELL);
    }

    /**
     * Create a <code>data.air_quality_cell</code> table reference
     */
    public AirQualityCell() {
        this(DSL.name("air_quality_cell"), null);
    }

    public <O extends Record> AirQualityCell(Table<O> child, ForeignKey<O, AirQualityCellRecord> key) {
        super(child, key, AIR_QUALITY_CELL);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public List<ForeignKey<AirQualityCellRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AirQualityCellRecord, ?>>asList(Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_AIR_QUALITY_LAYER_ID_FKEY, Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_METRIC_ID_FKEY, Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_SEASONAL_METRIC_ID_FKEY);
    }

    private transient AirQualityLayer _airQualityLayer;
    private transient PollutantMetric _pollutantMetric;
    private transient SeasonalMetric _seasonalMetric;

    public AirQualityLayer airQualityLayer() {
        if (_airQualityLayer == null)
            _airQualityLayer = new AirQualityLayer(this, Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_AIR_QUALITY_LAYER_ID_FKEY);

        return _airQualityLayer;
    }

    public PollutantMetric pollutantMetric() {
        if (_pollutantMetric == null)
            _pollutantMetric = new PollutantMetric(this, Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_METRIC_ID_FKEY);

        return _pollutantMetric;
    }

    public SeasonalMetric seasonalMetric() {
        if (_seasonalMetric == null)
            _seasonalMetric = new SeasonalMetric(this, Keys.AIR_QUALITY_CELL__AIR_QUALITY_CELL_SEASONAL_METRIC_ID_FKEY);

        return _seasonalMetric;
    }

    @Override
    public AirQualityCell as(String alias) {
        return new AirQualityCell(DSL.name(alias), this);
    }

    @Override
    public AirQualityCell as(Name alias) {
        return new AirQualityCell(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirQualityCell rename(String name) {
        return new AirQualityCell(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirQualityCell rename(Name name) {
        return new AirQualityCell(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Long, Integer, Integer, String, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
