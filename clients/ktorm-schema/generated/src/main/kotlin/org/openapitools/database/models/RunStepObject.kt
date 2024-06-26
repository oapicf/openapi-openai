/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Represents a step in execution of a run. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param object The object type, which is always `thread.run.step`.
 * @param createdAt The Unix timestamp (in seconds) for when the run step was created.
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
 * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
 * @param type The type of run step, which can be either `message_creation` or `tool_calls`.
 * @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
 * @param stepDetails 
 * @param lastError 
 * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
 * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled.
 * @param failedAt The Unix timestamp (in seconds) for when the run step failed.
 * @param completedAt The Unix timestamp (in seconds) for when the run step completed.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param usage 
 */
object RunStepObjects : BaseTable<RunStepObject>("RunStepObject") {
    val id = text("id") /* The identifier of the run step, which can be referenced in API endpoints. */
    val object = text("object").transform({ RunStepObject.Object.valueOf(it) }, { it.value }) /* The object type, which is always `thread.run.step`. */
    val createdAt = int("created_at") /* The Unix timestamp (in seconds) for when the run step was created. */
    val assistantId = text("assistant_id") /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    val threadId = text("thread_id") /* The ID of the [thread](/docs/api-reference/threads) that was run. */
    val runId = text("run_id") /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    val type = text("type").transform({ RunStepObject.Type.valueOf(it) }, { it.value }) /* The type of run step, which can be either `message_creation` or `tool_calls`. */
    val status = text("status").transform({ RunStepObject.Status.valueOf(it) }, { it.value }) /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
    val stepDetails = long("step_details")
    val lastError = long("last_error")
    val expiredAt = int("expired_at") /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    val cancelledAt = int("cancelled_at") /* The Unix timestamp (in seconds) for when the run step was cancelled. */
    val failedAt = int("failed_at") /* The Unix timestamp (in seconds) for when the run step failed. */
    val completedAt = int("completed_at") /* The Unix timestamp (in seconds) for when the run step completed. */
    val metadata = blob("metadata") /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    val usage = long("usage")

    /**
     * Create an entity of type RunStepObject from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RunStepObject(
        id = row[id] ?: "" /* kotlin.String */ /* The identifier of the run step, which can be referenced in API endpoints. */,
        object = row[object] ?: RunStepObject.Object.valueOf("") /* kotlin.String */ /* The object type, which is always `thread.run.step`. */,
        createdAt = row[createdAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the run step was created. */,
        assistantId = row[assistantId] ?: "" /* kotlin.String */ /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */,
        threadId = row[threadId] ?: "" /* kotlin.String */ /* The ID of the [thread](/docs/api-reference/threads) that was run. */,
        runId = row[runId] ?: "" /* kotlin.String */ /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */,
        type = row[type] ?: RunStepObject.Type.valueOf("") /* kotlin.String */ /* The type of run step, which can be either `message_creation` or `tool_calls`. */,
        status = row[status] ?: RunStepObject.Status.valueOf("") /* kotlin.String */ /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */,
        stepDetails = RunStepObjectStepDetailss.createEntity(row, withReferences) /* RunStepObjectStepDetails */,
        lastError = RunStepObjectLastErrors.createEntity(row, withReferences) /* RunStepObjectLastError */,
        expiredAt = row[expiredAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */,
        cancelledAt = row[cancelledAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the run step was cancelled. */,
        failedAt = row[failedAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the run step failed. */,
        completedAt = row[completedAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the run step completed. */,
        metadata = row[metadata] /* kotlin.Any */ /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */,
        usage = RunStepCompletionUsages.createEntity(row, withReferences) /* RunStepCompletionUsage */
    )

    /**
    * Assign all the columns from the entity of type RunStepObject to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RunStepObject()
    * database.update(RunStepObjects, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RunStepObject) {
        this.apply {
            set(RunStepObjects.id, entity.id)
            set(RunStepObjects.object, entity.object)
            set(RunStepObjects.createdAt, entity.createdAt)
            set(RunStepObjects.assistantId, entity.assistantId)
            set(RunStepObjects.threadId, entity.threadId)
            set(RunStepObjects.runId, entity.runId)
            set(RunStepObjects.type, entity.type)
            set(RunStepObjects.status, entity.status)
            set(RunStepObjects.stepDetails, entity.stepDetails)
            set(RunStepObjects.lastError, entity.lastError)
            set(RunStepObjects.expiredAt, entity.expiredAt)
            set(RunStepObjects.cancelledAt, entity.cancelledAt)
            set(RunStepObjects.failedAt, entity.failedAt)
            set(RunStepObjects.completedAt, entity.completedAt)
            set(RunStepObjects.metadata, entity.metadata)
            set(RunStepObjects.usage, entity.usage)
        }
    }

}


