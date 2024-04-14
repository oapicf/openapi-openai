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
package org.openapitools.server.models

import org.openapitools.server.models.RunStepCompletionUsage
import org.openapitools.server.models.RunStepObjectLastError
import org.openapitools.server.models.RunStepObjectStepDetails

/**
 * Represents a step in execution of a run. 
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
data class RunStepObject(
    /* The identifier of the run step, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /* The object type, which is always `thread.run.step`. */
    val `object`: RunStepObject.`Object`,
    /* The Unix timestamp (in seconds) for when the run step was created. */
    val createdAt: kotlin.Int,
    /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    val assistantId: kotlin.String,
    /* The ID of the [thread](/docs/api-reference/threads) that was run. */
    val threadId: kotlin.String,
    /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    val runId: kotlin.String,
    /* The type of run step, which can be either `message_creation` or `tool_calls`. */
    val type: RunStepObject.Type,
    /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
    val status: RunStepObject.Status,
    val stepDetails: RunStepObjectStepDetails,
    val lastError: RunStepObjectLastError,
    /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    val expiredAt: kotlin.Int,
    /* The Unix timestamp (in seconds) for when the run step was cancelled. */
    val cancelledAt: kotlin.Int,
    /* The Unix timestamp (in seconds) for when the run step failed. */
    val failedAt: kotlin.Int,
    /* The Unix timestamp (in seconds) for when the run step completed. */
    val completedAt: kotlin.Int,
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    val metadata: kotlin.Any,
    val usage: RunStepCompletionUsage
) 
{
    /**
    * The object type, which is always `thread.run.step`.
    * Values: threadPeriodRunPeriodStep
    */
    enum class `Object`(val value: kotlin.String){
        threadPeriodRunPeriodStep("thread.run.step");
    }
    /**
    * The type of run step, which can be either `message_creation` or `tool_calls`.
    * Values: message_creation,tool_calls
    */
    enum class Type(val value: kotlin.String){
        message_creation("message_creation"),
        tool_calls("tool_calls");
    }
    /**
    * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    * Values: in_progress,cancelled,failed,completed,expired
    */
    enum class Status(val value: kotlin.String){
        in_progress("in_progress"),
        cancelled("cancelled"),
        failed("failed"),
        completed("completed"),
        expired("expired");
    }
}

