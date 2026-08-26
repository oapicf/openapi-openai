@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestToolMessage(
    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("content")
    val content: ChatCompletionRequestToolMessageContent,

    @field:JsonProperty("tool_call_id")
    val toolCallId: kotlin.String,

)
