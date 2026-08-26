package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionMessageToolCallFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionMessageToolCall(
    /** The ID of the tool call. */
    val id: kotlin.String,
    /** The type of the tool. Currently, only &#x60;function&#x60; is supported. */
    val type: kotlin.String,
    val function: ChatCompletionMessageToolCallFunction
)
