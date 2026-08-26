@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessage(
    @field:JsonProperty("content")
    val content: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("tool_call_id")
    val toolCallId: kotlin.String,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String? = null,

    @field:JsonProperty("audio")
    val audio: ChatCompletionRequestAssistantMessageAudio? = null,

    @field:JsonProperty("tool_calls")
    val toolCalls: kotlin.collections.List<ChatCompletionMessageToolCall>? = null,

    @field:JsonProperty("function_call")
    val functionCall: ChatCompletionRequestAssistantMessageFunctionCall? = null,

)
