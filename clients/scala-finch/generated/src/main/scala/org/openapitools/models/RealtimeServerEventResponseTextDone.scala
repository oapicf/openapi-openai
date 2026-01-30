package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.text.done`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param text The final text content.
 */
case class RealtimeServerEventResponseTextDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                text: String
                )

object RealtimeServerEventResponseTextDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseTextDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseTextDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseTextDone] = deriveEncoder
}
