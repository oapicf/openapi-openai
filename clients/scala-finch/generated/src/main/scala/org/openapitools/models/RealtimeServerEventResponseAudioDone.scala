package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.audio.done`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 */
case class RealtimeServerEventResponseAudioDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int
                )

object RealtimeServerEventResponseAudioDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseAudioDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseAudioDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseAudioDone] = deriveEncoder
}
