package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeConversationItem

/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.item.created`.
 * @param previousUnderscoreitemUnderscoreid The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
 * @param item 
 */
case class RealtimeServerEventConversationItemCreated(eventUnderscoreid: String,
                _type: String,
                previousUnderscoreitemUnderscoreid: String,
                item: RealtimeConversationItem
                )

object RealtimeServerEventConversationItemCreated {
    /**
     * Creates the codec for converting RealtimeServerEventConversationItemCreated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationItemCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationItemCreated] = deriveEncoder
}
