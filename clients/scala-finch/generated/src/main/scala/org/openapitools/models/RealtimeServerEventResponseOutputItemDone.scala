package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeConversationItem

/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.output_item.done`.
 * @param responseUnderscoreid The ID of the Response to which the item belongs.
 * @param outputUnderscoreindex The index of the output item in the Response.
 * @param item 
 */
case class RealtimeServerEventResponseOutputItemDone(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                outputUnderscoreindex: Int,
                item: RealtimeConversationItem
                )

object RealtimeServerEventResponseOutputItemDone {
    /**
     * Creates the codec for converting RealtimeServerEventResponseOutputItemDone from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseOutputItemDone] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseOutputItemDone] = deriveEncoder
}
