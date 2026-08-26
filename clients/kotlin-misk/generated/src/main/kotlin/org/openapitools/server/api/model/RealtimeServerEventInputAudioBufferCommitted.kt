package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventInputAudioBufferCommitted(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;input_audio_buffer.committed&#x60;. */
    val type: kotlin.String,
    /** The ID of the preceding item after which the new item will be inserted.  */
    val previousItemId: kotlin.String,
    /** The ID of the user message item that will be created. */
    val itemId: kotlin.String
)
