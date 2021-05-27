/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables.records;


import gov.epa.bencloud.server.database.jooq.tables.TaskQueue;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskQueueRecord extends UpdatableRecordImpl<TaskQueueRecord> implements Record11<Long, String, Integer, String, String, String, String, Integer, Boolean, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.task_queue.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.task_queue.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>data.task_queue.user_identifier</code>.
     */
    public void setUserIdentifier(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.task_queue.user_identifier</code>.
     */
    public String getUserIdentifier() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.task_queue.priority</code>.
     */
    public void setPriority(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.task_queue.priority</code>.
     */
    public Integer getPriority() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.task_queue.task_uuid</code>.
     */
    public void setTaskUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.task_queue.task_uuid</code>.
     */
    public String getTaskUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>data.task_queue.task_name</code>.
     */
    public void setTaskName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.task_queue.task_name</code>.
     */
    public String getTaskName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>data.task_queue.task_description</code>.
     */
    public void setTaskDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.task_queue.task_description</code>.
     */
    public String getTaskDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>data.task_queue.task_data</code>.
     */
    public void setTaskData(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.task_queue.task_data</code>.
     */
    public String getTaskData() {
        return (String) get(6);
    }

    /**
     * Setter for <code>data.task_queue.task_percentage</code>.
     */
    public void setTaskPercentage(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.task_queue.task_percentage</code>.
     */
    public Integer getTaskPercentage() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>data.task_queue.in_process</code>.
     */
    public void setInProcess(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.task_queue.in_process</code>.
     */
    public Boolean getInProcess() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>data.task_queue.submitted_date</code>.
     */
    public void setSubmittedDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.task_queue.submitted_date</code>.
     */
    public LocalDateTime getSubmittedDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>data.task_queue.started_date</code>.
     */
    public void setStartedDate(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.task_queue.started_date</code>.
     */
    public LocalDateTime getStartedDate() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, Integer, String, String, String, String, Integer, Boolean, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, Integer, String, String, String, String, Integer, Boolean, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TaskQueue.TASK_QUEUE.ID;
    }

    @Override
    public Field<String> field2() {
        return TaskQueue.TASK_QUEUE.USER_IDENTIFIER;
    }

    @Override
    public Field<Integer> field3() {
        return TaskQueue.TASK_QUEUE.PRIORITY;
    }

    @Override
    public Field<String> field4() {
        return TaskQueue.TASK_QUEUE.TASK_UUID;
    }

    @Override
    public Field<String> field5() {
        return TaskQueue.TASK_QUEUE.TASK_NAME;
    }

    @Override
    public Field<String> field6() {
        return TaskQueue.TASK_QUEUE.TASK_DESCRIPTION;
    }

    @Override
    public Field<String> field7() {
        return TaskQueue.TASK_QUEUE.TASK_DATA;
    }

    @Override
    public Field<Integer> field8() {
        return TaskQueue.TASK_QUEUE.TASK_PERCENTAGE;
    }

    @Override
    public Field<Boolean> field9() {
        return TaskQueue.TASK_QUEUE.IN_PROCESS;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return TaskQueue.TASK_QUEUE.SUBMITTED_DATE;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return TaskQueue.TASK_QUEUE.STARTED_DATE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserIdentifier();
    }

    @Override
    public Integer component3() {
        return getPriority();
    }

    @Override
    public String component4() {
        return getTaskUuid();
    }

    @Override
    public String component5() {
        return getTaskName();
    }

    @Override
    public String component6() {
        return getTaskDescription();
    }

    @Override
    public String component7() {
        return getTaskData();
    }

    @Override
    public Integer component8() {
        return getTaskPercentage();
    }

    @Override
    public Boolean component9() {
        return getInProcess();
    }

    @Override
    public LocalDateTime component10() {
        return getSubmittedDate();
    }

    @Override
    public LocalDateTime component11() {
        return getStartedDate();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserIdentifier();
    }

    @Override
    public Integer value3() {
        return getPriority();
    }

    @Override
    public String value4() {
        return getTaskUuid();
    }

    @Override
    public String value5() {
        return getTaskName();
    }

    @Override
    public String value6() {
        return getTaskDescription();
    }

    @Override
    public String value7() {
        return getTaskData();
    }

    @Override
    public Integer value8() {
        return getTaskPercentage();
    }

    @Override
    public Boolean value9() {
        return getInProcess();
    }

    @Override
    public LocalDateTime value10() {
        return getSubmittedDate();
    }

    @Override
    public LocalDateTime value11() {
        return getStartedDate();
    }

    @Override
    public TaskQueueRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TaskQueueRecord value2(String value) {
        setUserIdentifier(value);
        return this;
    }

    @Override
    public TaskQueueRecord value3(Integer value) {
        setPriority(value);
        return this;
    }

    @Override
    public TaskQueueRecord value4(String value) {
        setTaskUuid(value);
        return this;
    }

    @Override
    public TaskQueueRecord value5(String value) {
        setTaskName(value);
        return this;
    }

    @Override
    public TaskQueueRecord value6(String value) {
        setTaskDescription(value);
        return this;
    }

    @Override
    public TaskQueueRecord value7(String value) {
        setTaskData(value);
        return this;
    }

    @Override
    public TaskQueueRecord value8(Integer value) {
        setTaskPercentage(value);
        return this;
    }

    @Override
    public TaskQueueRecord value9(Boolean value) {
        setInProcess(value);
        return this;
    }

    @Override
    public TaskQueueRecord value10(LocalDateTime value) {
        setSubmittedDate(value);
        return this;
    }

    @Override
    public TaskQueueRecord value11(LocalDateTime value) {
        setStartedDate(value);
        return this;
    }

    @Override
    public TaskQueueRecord values(Long value1, String value2, Integer value3, String value4, String value5, String value6, String value7, Integer value8, Boolean value9, LocalDateTime value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskQueueRecord
     */
    public TaskQueueRecord() {
        super(TaskQueue.TASK_QUEUE);
    }

    /**
     * Create a detached, initialised TaskQueueRecord
     */
    public TaskQueueRecord(Long id, String userIdentifier, Integer priority, String taskUuid, String taskName, String taskDescription, String taskData, Integer taskPercentage, Boolean inProcess, LocalDateTime submittedDate, LocalDateTime startedDate) {
        super(TaskQueue.TASK_QUEUE);

        setId(id);
        setUserIdentifier(userIdentifier);
        setPriority(priority);
        setTaskUuid(taskUuid);
        setTaskName(taskName);
        setTaskDescription(taskDescription);
        setTaskData(taskData);
        setTaskPercentage(taskPercentage);
        setInProcess(inProcess);
        setSubmittedDate(submittedDate);
        setStartedDate(startedDate);
    }
}