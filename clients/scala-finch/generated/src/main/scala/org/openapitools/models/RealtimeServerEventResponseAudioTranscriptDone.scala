package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.audio_transcript.done`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param transcript The final transcript of the audio.
 */
case class RealtimeServerEventResponseAudioTranscriptDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                transcript: String
                )

object RealtimeServerEventResponseAudioTranscriptDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseAudioTranscriptDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseAudioTranscriptDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseAudioTranscriptDone] = deriveEncoder
}
