package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestMessageContentPartAudioInputAudio
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestMessageContentPartAudio(
    /** The type of the content part. Always &#x60;input_audio&#x60;. */
    val type: kotlin.String,
    val inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)
