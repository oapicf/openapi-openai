package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestFunctionMessage(
    /** The role of the messages author, in this case &#x60;function&#x60;. */
    val role: kotlin.String,
    /** The contents of the function message. */
    val content: kotlin.String,
    /** The name of the function to call. */
    val name: kotlin.String
)
