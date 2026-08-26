package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionMessageToolCallChunkFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionMessageToolCallChunk(
    val index: kotlin.Int,
    /** The ID of the tool call. */
    val id: kotlin.String? = null,
    /** The type of the tool. Currently, only &#x60;function&#x60; is supported. */
    val type: kotlin.String? = null,
    val function: ChatCompletionMessageToolCallChunkFunction? = null
)
