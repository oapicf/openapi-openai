package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.item.input_audio_transcription.failed`. 
 * @param itemUnderscoreid The ID of the user message item.
 * @param contentUnderscoreindex The index of the content part containing the audio.
 * @param error 
 */
case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed(eventUnderscoreid: String,
                _type: String,
                itemUnderscoreid: String,
                contentUnderscoreindex: Int,
                error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
                )

object RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemInputAudioTranscriptionFailed from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = deriveEncoder
}
