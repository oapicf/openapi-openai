package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemTruncated._

case class RealtimeServerEventConversationItemTruncated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.item.truncated`. */
  `type`: `Type`,
/* The ID of the assistant message item that was truncated. */
  itemId: String,
/* The index of the content part that was truncated. */
  contentIndex: Integer,
/* The duration up to which the audio was truncated, in milliseconds.  */
  audioEndMs: Integer)

object RealtimeServerEventConversationItemTruncated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemTruncated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemTruncated" => Some(ConversationItemTruncated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemTruncated => "ConversationItemTruncated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationItemTruncatedCodecJson: CodecJson[RealtimeServerEventConversationItemTruncated] = CodecJson.derive[RealtimeServerEventConversationItemTruncated]
  implicit val RealtimeServerEventConversationItemTruncatedDecoder: EntityDecoder[RealtimeServerEventConversationItemTruncated] = jsonOf[RealtimeServerEventConversationItemTruncated]
  implicit val RealtimeServerEventConversationItemTruncatedEncoder: EntityEncoder[RealtimeServerEventConversationItemTruncated] = jsonEncoderOf[RealtimeServerEventConversationItemTruncated]
}
