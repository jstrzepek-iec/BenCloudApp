/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.SeasonalMetricSeasonRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class SeasonalMetricSeason extends TableImpl<SeasonalMetricSeasonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.seasonal_metric_season</code>
     */
    public static final SeasonalMetricSeason SEASONAL_METRIC_SEASON = new SeasonalMetricSeason();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonalMetricSeasonRecord> getRecordType() {
        return SeasonalMetricSeasonRecord.class;
    }

    /**
     * The column <code>data.seasonal_metric_season.id</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.seasonal_metric_season.seasonal_metric_id</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, Integer> SEASONAL_METRIC_ID = createField(DSL.name("seasonal_metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.seasonal_metric_season.start_day</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, Short> START_DAY = createField(DSL.name("start_day"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.seasonal_metric_season.end_day</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, Short> END_DAY = createField(DSL.name("end_day"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.seasonal_metric_season.seasonal_metric_type</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, Short> SEASONAL_METRIC_TYPE = createField(DSL.name("seasonal_metric_type"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.seasonal_metric_season.metric_function</code>.
     */
    public final TableField<SeasonalMetricSeasonRecord, String> METRIC_FUNCTION = createField(DSL.name("metric_function"), SQLDataType.CLOB, this, "");

    private SeasonalMetricSeason(Name alias, Table<SeasonalMetricSeasonRecord> aliased) {
        this(alias, aliased, null);
    }

    private SeasonalMetricSeason(Name alias, Table<SeasonalMetricSeasonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.seasonal_metric_season</code> table reference
     */
    public SeasonalMetricSeason(String alias) {
        this(DSL.name(alias), SEASONAL_METRIC_SEASON);
    }

    /**
     * Create an aliased <code>data.seasonal_metric_season</code> table reference
     */
    public SeasonalMetricSeason(Name alias) {
        this(alias, SEASONAL_METRIC_SEASON);
    }

    /**
     * Create a <code>data.seasonal_metric_season</code> table reference
     */
    public SeasonalMetricSeason() {
        this(DSL.name("seasonal_metric_season"), null);
    }

    public <O extends Record> SeasonalMetricSeason(Table<O> child, ForeignKey<O, SeasonalMetricSeasonRecord> key) {
        super(child, key, SEASONAL_METRIC_SEASON);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<SeasonalMetricSeasonRecord, Integer> getIdentity() {
        return (Identity<SeasonalMetricSeasonRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SeasonalMetricSeasonRecord> getPrimaryKey() {
        return Keys.SEASONAL_METRIC_SEASON_PKEY;
    }

    @Override
    public List<UniqueKey<SeasonalMetricSeasonRecord>> getKeys() {
        return Arrays.<UniqueKey<SeasonalMetricSeasonRecord>>asList(Keys.SEASONAL_METRIC_SEASON_PKEY);
    }

    @Override
    public List<ForeignKey<SeasonalMetricSeasonRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SeasonalMetricSeasonRecord, ?>>asList(Keys.SEASONAL_METRIC_SEASON__SEASONAL_METRIC_SEASON_SEASONAL_METRIC_ID_FKEY);
    }

    private transient SeasonalMetric _seasonalMetric;

    public SeasonalMetric seasonalMetric() {
        if (_seasonalMetric == null)
            _seasonalMetric = new SeasonalMetric(this, Keys.SEASONAL_METRIC_SEASON__SEASONAL_METRIC_SEASON_SEASONAL_METRIC_ID_FKEY);

        return _seasonalMetric;
    }

    @Override
    public SeasonalMetricSeason as(String alias) {
        return new SeasonalMetricSeason(DSL.name(alias), this);
    }

    @Override
    public SeasonalMetricSeason as(Name alias) {
        return new SeasonalMetricSeason(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonalMetricSeason rename(String name) {
        return new SeasonalMetricSeason(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonalMetricSeason rename(Name name) {
        return new SeasonalMetricSeason(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Short, Short, Short, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
