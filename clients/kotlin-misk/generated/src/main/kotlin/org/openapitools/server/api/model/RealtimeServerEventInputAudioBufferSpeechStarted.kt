package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventInputAudioBufferSpeechStarted(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;input_audio_buffer.speech_started&#x60;. */
    val type: kotlin.String,
    /** Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session.  */
    val audioStartMs: kotlin.Int,
    /** The ID of the user message item that will be created when speech stops.  */
    val itemId: kotlin.String
)
