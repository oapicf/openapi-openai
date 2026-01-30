package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `conversation.item.delete`.
 * @param itemUnderscoreid The ID of the item to delete.
 */
case class RealtimeClientEventConversationItemDelete(eventUnderscoreid: Option[String],
                _type: String,
                itemUnderscoreid: String
                )

object RealtimeClientEventConversationItemDelete {
    /**
     * Creates the codec for converting RealtimeClientEventConversationItemDelete from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventConversationItemDelete] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventConversationItemDelete] = deriveEncoder
}
