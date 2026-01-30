package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The conversation resource.
 * @param id The unique ID of the conversation.
 * @param _object The object type, must be `realtime.conversation`.
 */
case class RealtimeServerEventConversationCreatedConversation(id: Option[String],
                _object: Option[String]
                )

object RealtimeServerEventConversationCreatedConversation {
    /**
     * Creates the codec for converting RealtimeServerEventConversationCreatedConversation from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeServerEventConversationCreatedConversation] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeServerEventConversationCreatedConversation] = deriveEncoder
}
