package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestMessageContentPartAudioInputAudio(
    /** Base64 encoded audio data. */
    val `data`: kotlin.String,
    /** The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;.  */
    val format: kotlin.String
)
