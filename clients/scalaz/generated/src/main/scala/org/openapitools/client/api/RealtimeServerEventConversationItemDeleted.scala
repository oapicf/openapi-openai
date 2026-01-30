package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemDeleted._

case class RealtimeServerEventConversationItemDeleted (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.item.deleted`. */
  `type`: `Type`,
/* The ID of the item that was deleted. */
  itemId: String)

object RealtimeServerEventConversationItemDeleted {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemDeleted extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemDeleted" => Some(ConversationItemDeleted)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemDeleted => "ConversationItemDeleted"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationItemDeletedCodecJson: CodecJson[RealtimeServerEventConversationItemDeleted] = CodecJson.derive[RealtimeServerEventConversationItemDeleted]
  implicit val RealtimeServerEventConversationItemDeletedDecoder: EntityDecoder[RealtimeServerEventConversationItemDeleted] = jsonOf[RealtimeServerEventConversationItemDeleted]
  implicit val RealtimeServerEventConversationItemDeletedEncoder: EntityEncoder[RealtimeServerEventConversationItemDeleted] = jsonEncoderOf[RealtimeServerEventConversationItemDeleted]
}
