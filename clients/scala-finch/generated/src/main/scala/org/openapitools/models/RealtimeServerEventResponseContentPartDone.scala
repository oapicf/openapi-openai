package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventResponseContentPartDonePart

/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.content_part.done`.
 * @param responseUnderscoreid The ID of the response.
 * @param itemUnderscoreid The ID of the item.
 * @param outputUnderscoreindex The index of the output item in the response.
 * @param contentUnderscoreindex The index of the content part in the item's content array.
 * @param part 
 */
case class RealtimeServerEventResponseContentPartDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                itemUnderscoreid: String,
                outputUnderscoreindex: Int,
                contentUnderscoreindex: Int,
                part: RealtimeServerEventResponseContentPartDonePart
                )

object RealtimeServerEventResponseContentPartDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseContentPartDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseContentPartDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseContentPartDone] = deriveEncoder
}
