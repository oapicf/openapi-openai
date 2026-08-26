package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestMessageContentPartText(
    /** The type of the content part. */
    val type: kotlin.String,
    /** The text content. */
    val text: kotlin.String
)
