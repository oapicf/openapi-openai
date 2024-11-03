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

import org.openapitools.client.models.AssistantObjectToolsInner
import org.openapitools.client.models.AssistantsApiResponseFormatOption
import org.openapitools.client.models.AssistantsApiToolChoiceOption
import org.openapitools.client.models.RunCompletionUsage
import org.openapitools.client.models.RunObjectIncompleteDetails
import org.openapitools.client.models.RunObjectLastError
import org.openapitools.client.models.RunObjectRequiredAction
import org.openapitools.client.models.TruncationObject

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 *
 * @param id The identifier, which can be referenced in API endpoints.
 * @param `object` The object type, which is always `thread.run`.
 * @param createdAt The Unix timestamp (in seconds) for when the run was created.
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
 * @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
 * @param requiredAction 
 * @param lastError 
 * @param expiresAt The Unix timestamp (in seconds) for when the run will expire.
 * @param startedAt The Unix timestamp (in seconds) for when the run was started.
 * @param cancelledAt The Unix timestamp (in seconds) for when the run was cancelled.
 * @param failedAt The Unix timestamp (in seconds) for when the run failed.
 * @param completedAt The Unix timestamp (in seconds) for when the run was completed.
 * @param incompleteDetails 
 * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param fileIds The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param usage 
 * @param maxPromptTokens The maximum number of prompt tokens specified to have been used over the course of the run. 
 * @param maxCompletionTokens The maximum number of completion tokens specified to have been used over the course of the run. 
 * @param truncationStrategy 
 * @param toolChoice 
 * @param responseFormat 
 * @param temperature The sampling temperature used for this run. If not set, defaults to 1.
 */


data class RunObject (

    /* The identifier, which can be referenced in API endpoints. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The object type, which is always `thread.run`. */
    @Json(name = "object")
    val `object`: RunObject.`Object`,

    /* The Unix timestamp (in seconds) for when the run was created. */
    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    /* The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
    @Json(name = "thread_id")
    val threadId: kotlin.String,

    /* The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
    @Json(name = "assistant_id")
    val assistantId: kotlin.String,

    /* The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`. */
    @Json(name = "status")
    val status: RunObject.Status,

    @Json(name = "required_action")
    val requiredAction: RunObjectRequiredAction?,

    @Json(name = "last_error")
    val lastError: RunObjectLastError?,

    /* The Unix timestamp (in seconds) for when the run will expire. */
    @Json(name = "expires_at")
    val expiresAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run was started. */
    @Json(name = "started_at")
    val startedAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run was cancelled. */
    @Json(name = "cancelled_at")
    val cancelledAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run failed. */
    @Json(name = "failed_at")
    val failedAt: kotlin.Int?,

    /* The Unix timestamp (in seconds) for when the run was completed. */
    @Json(name = "completed_at")
    val completedAt: kotlin.Int?,

    @Json(name = "incomplete_details")
    val incompleteDetails: RunObjectIncompleteDetails?,

    /* The model that the [assistant](/docs/api-reference/assistants) used for this run. */
    @Json(name = "model")
    val model: kotlin.String,

    /* The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
    @Json(name = "instructions")
    val instructions: kotlin.String,

    /* The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
    @Json(name = "tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),

    /* The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. */
    @Json(name = "file_ids")
    val fileIds: kotlin.collections.List<kotlin.String> = arrayListOf(),

    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    @Json(name = "metadata")
    val metadata: kotlin.Any?,

    @Json(name = "usage")
    val usage: RunCompletionUsage?,

    /* The maximum number of prompt tokens specified to have been used over the course of the run.  */
    @Json(name = "max_prompt_tokens")
    val maxPromptTokens: kotlin.Int?,

    /* The maximum number of completion tokens specified to have been used over the course of the run.  */
    @Json(name = "max_completion_tokens")
    val maxCompletionTokens: kotlin.Int?,

    @Json(name = "truncation_strategy")
    val truncationStrategy: TruncationObject,

    @Json(name = "tool_choice")
    val toolChoice: AssistantsApiToolChoiceOption,

    @Json(name = "response_format")
    val responseFormat: AssistantsApiResponseFormatOption,

    /* The sampling temperature used for this run. If not set, defaults to 1. */
    @Json(name = "temperature")
    val temperature: java.math.BigDecimal? = null

) {

    /**
     * The object type, which is always `thread.run`.
     *
     * Values: threadPeriodRun
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "thread.run") threadPeriodRun("thread.run");
    }
    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     *
     * Values: queued,in_progress,requires_action,cancelling,cancelled,failed,completed,expired
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "queued") queued("queued"),
        @Json(name = "in_progress") in_progress("in_progress"),
        @Json(name = "requires_action") requires_action("requires_action"),
        @Json(name = "cancelling") cancelling("cancelling"),
        @Json(name = "cancelled") cancelled("cancelled"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "completed") completed("completed"),
        @Json(name = "expired") expired("expired");
    }

}

