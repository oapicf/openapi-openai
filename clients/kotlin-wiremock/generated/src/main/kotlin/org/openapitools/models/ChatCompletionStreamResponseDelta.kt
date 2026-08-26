@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionStreamResponseDelta(
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    @field:JsonProperty("function_call")
    val functionCall: ChatCompletionStreamResponseDeltaFunctionCall? = null,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCallChunk>? = null,

    @field:JsonProperty("role")
    val role: kotlin.String? = null,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String? = null,

)
