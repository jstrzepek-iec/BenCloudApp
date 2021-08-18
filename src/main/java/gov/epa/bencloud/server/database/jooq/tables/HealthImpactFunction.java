/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.HealthImpactFunctionRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class HealthImpactFunction extends TableImpl<HealthImpactFunctionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.health_impact_function</code>
     */
    public static final HealthImpactFunction HEALTH_IMPACT_FUNCTION = new HealthImpactFunction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HealthImpactFunctionRecord> getRecordType() {
        return HealthImpactFunctionRecord.class;
    }

    /**
     * The column <code>data.health_impact_function.id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.health_impact_function.health_impact_function_dataset_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> HEALTH_IMPACT_FUNCTION_DATASET_ID = createField(DSL.name("health_impact_function_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.endpoint_group_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> ENDPOINT_GROUP_ID = createField(DSL.name("endpoint_group_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.endpoint_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> ENDPOINT_ID = createField(DSL.name("endpoint_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.pollutant_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> POLLUTANT_ID = createField(DSL.name("pollutant_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.metric_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> METRIC_ID = createField(DSL.name("metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.seasonal_metric_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> SEASONAL_METRIC_ID = createField(DSL.name("seasonal_metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.metric_statistic</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> METRIC_STATISTIC = createField(DSL.name("metric_statistic"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.author</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> AUTHOR = createField(DSL.name("author"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.function_year</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> FUNCTION_YEAR = createField(DSL.name("function_year"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.location</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> LOCATION = createField(DSL.name("location"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.other_pollutants</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> OTHER_POLLUTANTS = createField(DSL.name("other_pollutants"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.qualifier</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> QUALIFIER = createField(DSL.name("qualifier"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.reference</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> REFERENCE = createField(DSL.name("reference"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.start_age</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> START_AGE = createField(DSL.name("start_age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.end_age</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> END_AGE = createField(DSL.name("end_age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.function_text</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> FUNCTION_TEXT = createField(DSL.name("function_text"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.incidence_dataset_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> INCIDENCE_DATASET_ID = createField(DSL.name("incidence_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.prevalence_dataset_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> PREVALENCE_DATASET_ID = createField(DSL.name("prevalence_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.variable_dataset_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> VARIABLE_DATASET_ID = createField(DSL.name("variable_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.beta</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> BETA = createField(DSL.name("beta"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.dist_beta</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> DIST_BETA = createField(DSL.name("dist_beta"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.p1_beta</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> P1_BETA = createField(DSL.name("p1_beta"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.p2_beta</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> P2_BETA = createField(DSL.name("p2_beta"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.val_a</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> VAL_A = createField(DSL.name("val_a"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.name_a</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> NAME_A = createField(DSL.name("name_a"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.val_b</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> VAL_B = createField(DSL.name("val_b"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.name_b</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> NAME_B = createField(DSL.name("name_b"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.val_c</code>.
     */
    public final TableField<HealthImpactFunctionRecord, BigDecimal> VAL_C = createField(DSL.name("val_c"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>data.health_impact_function.name_c</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> NAME_C = createField(DSL.name("name_c"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.baseline_function_text</code>.
     */
    public final TableField<HealthImpactFunctionRecord, String> BASELINE_FUNCTION_TEXT = createField(DSL.name("baseline_function_text"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.health_impact_function.race_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> RACE_ID = createField(DSL.name("race_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.gender_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.ethnicity_id</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> ETHNICITY_ID = createField(DSL.name("ethnicity_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.start_day</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> START_DAY = createField(DSL.name("start_day"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.health_impact_function.end_day</code>.
     */
    public final TableField<HealthImpactFunctionRecord, Integer> END_DAY = createField(DSL.name("end_day"), SQLDataType.INTEGER, this, "");

    private HealthImpactFunction(Name alias, Table<HealthImpactFunctionRecord> aliased) {
        this(alias, aliased, null);
    }

    private HealthImpactFunction(Name alias, Table<HealthImpactFunctionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.health_impact_function</code> table reference
     */
    public HealthImpactFunction(String alias) {
        this(DSL.name(alias), HEALTH_IMPACT_FUNCTION);
    }

    /**
     * Create an aliased <code>data.health_impact_function</code> table reference
     */
    public HealthImpactFunction(Name alias) {
        this(alias, HEALTH_IMPACT_FUNCTION);
    }

    /**
     * Create a <code>data.health_impact_function</code> table reference
     */
    public HealthImpactFunction() {
        this(DSL.name("health_impact_function"), null);
    }

    public <O extends Record> HealthImpactFunction(Table<O> child, ForeignKey<O, HealthImpactFunctionRecord> key) {
        super(child, key, HEALTH_IMPACT_FUNCTION);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<HealthImpactFunctionRecord, Integer> getIdentity() {
        return (Identity<HealthImpactFunctionRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HealthImpactFunctionRecord> getPrimaryKey() {
        return Keys.HEALTH_IMPACT_FUNCTION_PKEY;
    }

    @Override
    public List<UniqueKey<HealthImpactFunctionRecord>> getKeys() {
        return Arrays.<UniqueKey<HealthImpactFunctionRecord>>asList(Keys.HEALTH_IMPACT_FUNCTION_PKEY);
    }

    @Override
    public HealthImpactFunction as(String alias) {
        return new HealthImpactFunction(DSL.name(alias), this);
    }

    @Override
    public HealthImpactFunction as(Name alias) {
        return new HealthImpactFunction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthImpactFunction rename(String name) {
        return new HealthImpactFunction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthImpactFunction rename(Name name) {
        return new HealthImpactFunction(name, null);
    }
}
