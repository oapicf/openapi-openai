package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventConversationItemDelete._

case class RealtimeClientEventConversationItemDelete (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `conversation.item.delete`. */
  `type`: `Type`,
/* The ID of the item to delete. */
  itemId: String)

object RealtimeClientEventConversationItemDelete {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemDelete extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemDelete" => Some(ConversationItemDelete)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemDelete => "ConversationItemDelete"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventConversationItemDeleteCodecJson: CodecJson[RealtimeClientEventConversationItemDelete] = CodecJson.derive[RealtimeClientEventConversationItemDelete]
  implicit val RealtimeClientEventConversationItemDeleteDecoder: EntityDecoder[RealtimeClientEventConversationItemDelete] = jsonOf[RealtimeClientEventConversationItemDelete]
  implicit val RealtimeClientEventConversationItemDeleteEncoder: EntityEncoder[RealtimeClientEventConversationItemDelete] = jsonEncoderOf[RealtimeClientEventConversationItemDelete]
}
