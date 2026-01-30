package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.item.deleted`.
 * @param itemUnderscoreid The ID of the item that was deleted.
 */
case class RealtimeServerEventConversationItemDeleted(eventUnderscoreid: String,
                _type: String,
                itemUnderscoreid: String
                )

object RealtimeServerEventConversationItemDeleted {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemDeleted from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemDeleted] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemDeleted] = deriveEncoder
}
