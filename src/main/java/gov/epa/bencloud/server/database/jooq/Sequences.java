/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>data.age_range_id_seq</code>
     */
    public static final Sequence<Integer> AGE_RANGE_ID_SEQ = Internal.createSequence("age_range_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.air_quality_layer_id_seq</code>
     */
    public static final Sequence<Integer> AIR_QUALITY_LAYER_ID_SEQ = Internal.createSequence("air_quality_layer_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.endpoint_group_id_seq</code>
     */
    public static final Sequence<Integer> ENDPOINT_GROUP_ID_SEQ = Internal.createSequence("endpoint_group_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.endpoint_id_seq</code>
     */
    public static final Sequence<Integer> ENDPOINT_ID_SEQ = Internal.createSequence("endpoint_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.ethnicity_id_seq</code>
     */
    public static final Sequence<Integer> ETHNICITY_ID_SEQ = Internal.createSequence("ethnicity_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.gender_id_seq</code>
     */
    public static final Sequence<Integer> GENDER_ID_SEQ = Internal.createSequence("gender_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.grid_definition_id_seq</code>
     */
    public static final Sequence<Integer> GRID_DEFINITION_ID_SEQ = Internal.createSequence("grid_definition_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.incidence_dataset_id_seq</code>
     */
    public static final Sequence<Integer> INCIDENCE_DATASET_ID_SEQ = Internal.createSequence("incidence_dataset_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.incidence_entry_id_seq</code>
     */
    public static final Sequence<Integer> INCIDENCE_ENTRY_ID_SEQ = Internal.createSequence("incidence_entry_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.income_growth_adj_dataset_id_seq</code>
     */
    public static final Sequence<Integer> INCOME_GROWTH_ADJ_DATASET_ID_SEQ = Internal.createSequence("income_growth_adj_dataset_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.income_growth_adj_factor_id_seq</code>
     */
    public static final Sequence<Integer> INCOME_GROWTH_ADJ_FACTOR_ID_SEQ = Internal.createSequence("income_growth_adj_factor_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.pollutant_id_seq</code>
     */
    public static final Sequence<Integer> POLLUTANT_ID_SEQ = Internal.createSequence("pollutant_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.pollutant_metric_id_seq</code>
     */
    public static final Sequence<Integer> POLLUTANT_METRIC_ID_SEQ = Internal.createSequence("pollutant_metric_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.pop_config_id_seq</code>
     */
    public static final Sequence<Integer> POP_CONFIG_ID_SEQ = Internal.createSequence("pop_config_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.population_dataset_id_seq</code>
     */
    public static final Sequence<Integer> POPULATION_DATASET_ID_SEQ = Internal.createSequence("population_dataset_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.race_id_seq</code>
     */
    public static final Sequence<Integer> RACE_ID_SEQ = Internal.createSequence("race_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.seasonal_metric_id_seq</code>
     */
    public static final Sequence<Integer> SEASONAL_METRIC_ID_SEQ = Internal.createSequence("seasonal_metric_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.seasonal_metric_season_id_seq</code>
     */
    public static final Sequence<Integer> SEASONAL_METRIC_SEASON_ID_SEQ = Internal.createSequence("seasonal_metric_season_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.task_complete_id_seq</code>
     */
    public static final Sequence<Integer> TASK_COMPLETE_ID_SEQ = Internal.createSequence("task_complete_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>data.task_queue_id_seq</code>
     */
    public static final Sequence<Integer> TASK_QUEUE_ID_SEQ = Internal.createSequence("task_queue_id_seq", Data.DATA, SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}
