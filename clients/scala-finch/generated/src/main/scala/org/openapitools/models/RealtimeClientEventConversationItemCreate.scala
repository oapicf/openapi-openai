package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeConversationItem

/**
 * Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
 * @param eventUnderscoreid Optional client-generated ID used to identify this event.
 * @param _type The event type, must be `conversation.item.create`.
 * @param previousUnderscoreitemUnderscoreid The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
 * @param item 
 */
case class RealtimeClientEventConversationItemCreate(eventUnderscoreid: Option[String],
                _type: String,
                previousUnderscoreitemUnderscoreid: Option[String],
                item: RealtimeConversationItem
                )

object RealtimeClientEventConversationItemCreate {
    /**
     * Creates the codec for converting RealtimeClientEventConversationItemCreate from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeClientEventConversationItemCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeClientEventConversationItemCreate] = deriveEncoder
}
