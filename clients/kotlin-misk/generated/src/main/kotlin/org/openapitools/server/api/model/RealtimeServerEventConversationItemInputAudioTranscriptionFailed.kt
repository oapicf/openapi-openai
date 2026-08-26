package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.  */
    val type: kotlin.String,
    /** The ID of the user message item. */
    val itemId: kotlin.String,
    /** The index of the content part containing the audio. */
    val contentIndex: kotlin.Int,
    val error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
)
