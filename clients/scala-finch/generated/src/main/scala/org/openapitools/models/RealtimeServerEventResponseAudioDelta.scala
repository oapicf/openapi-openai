package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the model-generated audio is updated.
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.audio.delta`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param delta Base64-encoded audio data delta.
 */
case class RealtimeServerEventResponseAudioDelta(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                delta: String
                )

object RealtimeServerEventResponseAudioDelta {
    /**
     * Creates the codec for converting RealtimeServerEventResponseAudioDelta from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseAudioDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseAudioDelta] = deriveEncoder
}
