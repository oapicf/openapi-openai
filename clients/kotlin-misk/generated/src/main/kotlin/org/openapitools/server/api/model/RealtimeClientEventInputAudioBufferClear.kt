package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeClientEventInputAudioBufferClear(
    /** The event type, must be &#x60;input_audio_buffer.clear&#x60;. */
    val type: kotlin.String,
    /** Optional client-generated ID used to identify this event. */
    val eventId: kotlin.String? = null
)
