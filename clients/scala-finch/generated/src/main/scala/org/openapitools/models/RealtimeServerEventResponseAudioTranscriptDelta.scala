package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the model-generated transcription of audio output is updated. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.audio_transcript.delta`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param delta The transcript delta.
 */
case class RealtimeServerEventResponseAudioTranscriptDelta(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                delta: String
                )

object RealtimeServerEventResponseAudioTranscriptDelta {
    /**
     * Creates the codec for converting RealtimeServerEventResponseAudioTranscriptDelta from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseAudioTranscriptDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseAudioTranscriptDelta] = deriveEncoder
}
