package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeSessionInputAudioTranscription(
    /** The model to use for transcription, &#x60;whisper-1&#x60; is the only currently  supported model.  */
    val model: kotlin.String? = null
)
