package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventInputAudioBufferSpeechStopped(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;. */
    val type: kotlin.String,
    /** Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.  */
    val audioEndMs: kotlin.Int,
    /** The ID of the user message item that will be created. */
    val itemId: kotlin.String
)
