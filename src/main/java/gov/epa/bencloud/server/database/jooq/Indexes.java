/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq;


import gov.epa.bencloud.server.database.jooq.tables.TaskComplete;
import gov.epa.bencloud.server.database.jooq.tables.TaskQueue;
import gov.epa.bencloud.server.database.jooq.tables.TaskWorker;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index TASK_COMPLETE_ON_DATE = Internal.createIndex(DSL.name("task_complete_on_date"), TaskComplete.TASK_COMPLETE, new OrderField[] { TaskComplete.TASK_COMPLETE.TASK_COMPLETED_DATE }, false);
    public static final Index TASK_COMPLETE_ON_UUID = Internal.createIndex(DSL.name("task_complete_on_uuid"), TaskComplete.TASK_COMPLETE, new OrderField[] { TaskComplete.TASK_COMPLETE.TASK_UUID }, false);
    public static final Index TASK_QUEUE_ON_DATE = Internal.createIndex(DSL.name("task_queue_on_date"), TaskQueue.TASK_QUEUE, new OrderField[] { TaskQueue.TASK_QUEUE.TASK_SUBMITTED_DATE }, false);
    public static final Index TASK_QUEUE_ON_PRIORITY_SUBMITTED_DATE = Internal.createIndex(DSL.name("task_queue_on_priority_submitted_date"), TaskQueue.TASK_QUEUE, new OrderField[] { TaskQueue.TASK_QUEUE.TASK_PRIORITY, TaskQueue.TASK_QUEUE.TASK_SUBMITTED_DATE }, false);
    public static final Index TASK_QUEUE_ON_UUID = Internal.createIndex(DSL.name("task_queue_on_uuid"), TaskQueue.TASK_QUEUE, new OrderField[] { TaskQueue.TASK_QUEUE.TASK_UUID }, false);
    public static final Index TASK_WORKER_ON_TASK_UUID = Internal.createIndex(DSL.name("task_worker_on_task_uuid"), TaskWorker.TASK_WORKER, new OrderField[] { TaskWorker.TASK_WORKER.TASK_UUID }, false);
    public static final Index TASK_WORKER_ON_UUID = Internal.createIndex(DSL.name("task_worker_on_uuid"), TaskWorker.TASK_WORKER, new OrderField[] { TaskWorker.TASK_WORKER.TASK_WORKER_UUID }, false);
}
