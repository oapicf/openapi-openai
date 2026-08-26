package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartAudio
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartAudioInputAudio
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImage
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestUserMessageContentPart(
    /** The type of the content part. */
    val type: kotlin.String,
    /** The text content. */
    val text: kotlin.String,
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,
    val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)
