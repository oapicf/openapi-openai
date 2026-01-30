package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemCreated._

case class RealtimeServerEventConversationItemCreated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.item.created`. */
  `type`: `Type`,
/* The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.  */
  previousItemId: String,
item: RealtimeConversationItem)

object RealtimeServerEventConversationItemCreated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemCreated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemCreated" => Some(ConversationItemCreated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemCreated => "ConversationItemCreated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationItemCreatedCodecJson: CodecJson[RealtimeServerEventConversationItemCreated] = CodecJson.derive[RealtimeServerEventConversationItemCreated]
  implicit val RealtimeServerEventConversationItemCreatedDecoder: EntityDecoder[RealtimeServerEventConversationItemCreated] = jsonOf[RealtimeServerEventConversationItemCreated]
  implicit val RealtimeServerEventConversationItemCreatedEncoder: EntityEncoder[RealtimeServerEventConversationItemCreated] = jsonEncoderOf[RealtimeServerEventConversationItemCreated]
}
