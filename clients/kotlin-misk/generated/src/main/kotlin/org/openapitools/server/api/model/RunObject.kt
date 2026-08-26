package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssistantObjectToolsInner
import org.openapitools.server.api.model.AssistantsApiResponseFormatOption
import org.openapitools.server.api.model.AssistantsApiToolChoiceOption
import org.openapitools.server.api.model.RunCompletionUsage
import org.openapitools.server.api.model.RunObjectIncompleteDetails
import org.openapitools.server.api.model.RunObjectLastError
import org.openapitools.server.api.model.RunObjectRequiredAction
import org.openapitools.server.api.model.TruncationObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread.run&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the run was created. */
    val createdAt: kotlin.Int,
    /** The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
    val threadId: kotlin.String,
    /** The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
    val assistantId: kotlin.String,
    /** The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. */
    val status: kotlin.String,
    val requiredAction: RunObjectRequiredAction,
    val lastError: RunObjectLastError,
    /** The Unix timestamp (in seconds) for when the run will expire. */
    val expiresAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run was started. */
    val startedAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run was cancelled. */
    val cancelledAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run failed. */
    val failedAt: kotlin.Int,
    /** The Unix timestamp (in seconds) for when the run was completed. */
    val completedAt: kotlin.Int,
    val incompleteDetails: RunObjectIncompleteDetails,
    /** The model that the [assistant](/docs/api-reference/assistants) used for this run. */
    val model: kotlin.String,
    /** The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
    val instructions: kotlin.String,
    /** The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
    val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any,
    val usage: RunCompletionUsage,
    /** The maximum number of prompt tokens specified to have been used over the course of the run.  */
    val maxPromptTokens: kotlin.Int,
    /** The maximum number of completion tokens specified to have been used over the course of the run.  */
    val maxCompletionTokens: kotlin.Int,
    val truncationStrategy: TruncationObject,
    val toolChoice: AssistantsApiToolChoiceOption,
    /** Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    val parallelToolCalls: kotlin.Boolean = true,
    val responseFormat: AssistantsApiResponseFormatOption,
    /** The sampling temperature used for this run. If not set, defaults to 1. */
    val temperature: java.math.BigDecimal? = null,
    /** The nucleus sampling value used for this run. If not set, defaults to 1. */
    val topP: java.math.BigDecimal? = null
)
