@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("thread_id")
    val threadId: kotlin.String,

    @field:JsonProperty("assistant_id")
    val assistantId: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("required_action")
    val requiredAction: RunObjectRequiredAction,

    @field:JsonProperty("last_error")
    val lastError: RunObjectLastError,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int,

    @field:JsonProperty("started_at")
    val startedAt: kotlin.Int,

    @field:JsonProperty("cancelled_at")
    val cancelledAt: kotlin.Int,

    @field:JsonProperty("failed_at")
    val failedAt: kotlin.Int,

    @field:JsonProperty("completed_at")
    val completedAt: kotlin.Int,

    @field:JsonProperty("incomplete_details")
    val incompleteDetails: RunObjectIncompleteDetails,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("instructions")
    val instructions: kotlin.String,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

    @field:JsonProperty("usage")
    val usage: RunCompletionUsage,

    @field:JsonProperty("max_prompt_tokens")
    val maxPromptTokens: kotlin.Int,

    @field:JsonProperty("max_completion_tokens")
    val maxCompletionTokens: kotlin.Int,

    @field:JsonProperty("truncation_strategy")
    val truncationStrategy: TruncationObject,

    @field:JsonProperty("tool_choice")
    val toolChoice: AssistantsApiToolChoiceOption,

    @field:JsonProperty("parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean = true,

    @field:JsonProperty("response_format")
    val responseFormat: AssistantsApiResponseFormatOption,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = null,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = null,

)
