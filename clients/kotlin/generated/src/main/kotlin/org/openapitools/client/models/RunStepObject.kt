/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.RunStepCompletionUsage
import org.openapitools.client.models.RunStepObjectLastError
import org.openapitools.client.models.RunStepObjectStepDetails

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents a step in execution of a run. 
 *
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `thread.run.step`.
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


data class RunStepObject (

    /* The identifier of the run step, which can be referenced in API endpoints. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The object type, which is always `thread.run.step`. */
    @Json(name = "object")
    val `object`: RunStepObject.`Object`,

    /* The Unix timestamp (in seconds) for when the run step was created. */
    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    @Json(name = "assistant_id")
    val assistantId: kotlin.String,

    /* The ID of the [thread](/docs/api-reference/threads) that was run. */
    @Json(name = "thread_id")
    val threadId: kotlin.String,

    /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    @Json(name = "run_id")
    val runId: kotlin.String,

    /* The type of run step, which can be either `message_creation` or `tool_calls`. */
    @Json(name = "type")
    val type: RunStepObject.Type,

    /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
    @Json(name = "status")
    val status: RunStepObject.Status,

    @Json(name = "step_details")
    val stepDetails: RunStepObjectStepDetails,

    @Json(name = "last_error")
    val lastError: RunStepObjectLastError?,

    /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    @Json(name = "expired_at")
    val expiredAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run step was cancelled. */
    @Json(name = "cancelled_at")
    val cancelledAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run step failed. */
    @Json(name = "failed_at")
    val failedAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run step completed. */
    @Json(name = "completed_at")
    val completedAt: kotlin.Int?,

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    @Json(name = "metadata")
    val metadata: kotlin.Any?,

    @Json(name = "usage")
    val usage: RunStepCompletionUsage?

) {

    /**
     * The object type, which is always `thread.run.step`.
     *
     * Values: threadPeriodRunPeriodStep
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "thread.run.step") threadPeriodRunPeriodStep("thread.run.step");
    }
    /**
     * The type of run step, which can be either `message_creation` or `tool_calls`.
     *
     * Values: message_creation,tool_calls
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "message_creation") message_creation("message_creation"),
        @Json(name = "tool_calls") tool_calls("tool_calls");
    }
    /**
     * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
     *
     * Values: in_progress,cancelled,failed,completed,expired
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "completed") completed("completed"),
        @Json(name = "expired") expired("expired");
    }

}

