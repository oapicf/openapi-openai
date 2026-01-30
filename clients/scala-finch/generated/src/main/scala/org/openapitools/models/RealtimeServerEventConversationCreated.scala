package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RealtimeServerEventConversationCreatedConversation

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 * @param eventUnderscoreid The unique ID of the server event.
 * @param _type The event type, must be `conversation.created`.
 * @param conversation 
 */
case class RealtimeServerEventConversationCreated(eventUnderscoreid: String,
                _type: String,
                conversation: RealtimeServerEventConversationCreatedConversation
                )

object RealtimeServerEventConversationCreated {
    /**
     * Creates the codec for converting RealtimeServerEventConversationCreated from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationCreated] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationCreated] = deriveEncoder
}
