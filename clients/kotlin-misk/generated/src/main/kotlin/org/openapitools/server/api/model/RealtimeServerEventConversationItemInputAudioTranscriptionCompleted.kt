package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;.  */
    val type: kotlin.String,
    /** The ID of the user message item containing the audio. */
    val itemId: kotlin.String,
    /** The index of the content part containing the audio. */
    val contentIndex: kotlin.Int,
    /** The transcribed text. */
    val transcript: kotlin.String
)
