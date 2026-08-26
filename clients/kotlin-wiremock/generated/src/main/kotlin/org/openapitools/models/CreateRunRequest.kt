@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateRunRequest(
    @field:JsonProperty("assistant_id")
    val assistantId: kotlin.String,

    @field:JsonProperty("model")
    val model: CreateRunRequestModel? = null,

    @field:JsonProperty("instructions")
    val instructions: kotlin.String? = null,

    @field:JsonProperty("additional_instructions")
    val additionalInstructions: kotlin.String? = null,

    @field:JsonProperty("additional_messages")
    val additionalMessages: kotlin.collections.List<CreateMessageRequest>? = null,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<AssistantObjectToolsInner>? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

    @field:JsonProperty("temperature")
    val temperature: java.math.BigDecimal? = 1,

    @field:JsonProperty("top_p")
    val topP: java.math.BigDecimal? = 1,

    @field:JsonProperty("stream")
    val stream: kotlin.Boolean? = null,

    @field:JsonProperty("max_prompt_tokens")
    val maxPromptTokens: kotlin.Int? = null,

    @field:JsonProperty("max_completion_tokens")
    val maxCompletionTokens: kotlin.Int? = null,

    @field:JsonProperty("truncation_strategy")
    val truncationStrategy: TruncationObject? = null,

    @field:JsonProperty("tool_choice")
    val toolChoice: AssistantsApiToolChoiceOption? = null,

    @field:JsonProperty("parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean? = true,

    @field:JsonProperty("response_format")
    val responseFormat: AssistantsApiResponseFormatOption? = null,

)
