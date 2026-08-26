package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImageImageUrl
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestMessageContentPartImage(
    /** The type of the content part. */
    val type: kotlin.String,
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)
