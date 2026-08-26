@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuneChatCompletionRequestAssistantMessage(
    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("content")
    val content: ChatCompletionRequestAssistantMessageContent? = null,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("audio")
    val audio: ChatCompletionRequestAssistantMessageAudio? = null,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,

    @field:JsonProperty("function_call")
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null,

    @field:JsonProperty("weight")
    val weight: kotlin.Int? = null,

)
