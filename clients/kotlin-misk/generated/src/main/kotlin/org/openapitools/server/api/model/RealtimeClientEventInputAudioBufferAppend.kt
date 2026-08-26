package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventInputAudioBufferAppend(
    /** The event type, must be &#x60;input_audio_buffer.append&#x60;. */
    val type: kotlin.String,
    /** Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration.  */
    val audio: kotlin.String,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null
)
