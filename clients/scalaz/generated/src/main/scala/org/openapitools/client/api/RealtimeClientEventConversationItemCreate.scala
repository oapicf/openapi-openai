package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventConversationItemCreate._

case class RealtimeClientEventConversationItemCreate (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `conversation.item.create`. */
  `type`: `Type`,
/* The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.  */
  previousItemId: Option[String],
item: RealtimeConversationItem)

object RealtimeClientEventConversationItemCreate {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemCreate extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemCreate" => Some(ConversationItemCreate)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemCreate => "ConversationItemCreate"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventConversationItemCreateCodecJson: CodecJson[RealtimeClientEventConversationItemCreate] = CodecJson.derive[RealtimeClientEventConversationItemCreate]
  implicit val RealtimeClientEventConversationItemCreateDecoder: EntityDecoder[RealtimeClientEventConversationItemCreate] = jsonOf[RealtimeClientEventConversationItemCreate]
  implicit val RealtimeClientEventConversationItemCreateEncoder: EntityEncoder[RealtimeClientEventConversationItemCreate] = jsonEncoderOf[RealtimeClientEventConversationItemCreate]
}
