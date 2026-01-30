package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeConversationItem

/**
 * Returned when a new Item is created during Response generation.
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `response.output_item.added`.
 * @param responseUnderscoreid The ID of the Response to which the item belongs.
 * @param outputUnderscoreindex The index of the output item in the Response.
 * @param item 
 */
case class RealtimeServerEventResponseOutputItemAdded(eventUnderscoreid: String,
                _type: String,
                responseUnderscoreid: String,
                outputUnderscoreindex: Int,
                item: RealtimeConversationItem
                )

object RealtimeServerEventResponseOutputItemAdded {
    /**
     * Creates the codec for converting RealtimeServerEventResponseOutputItemAdded from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventResponseOutputItemAdded] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventResponseOutputItemAdded] = deriveEncoder
}
