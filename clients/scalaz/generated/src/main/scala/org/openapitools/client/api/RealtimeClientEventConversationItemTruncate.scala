package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventConversationItemTruncate._

case class RealtimeClientEventConversationItemTruncate (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `conversation.item.truncate`. */
  `type`: `Type`,
/* The ID of the assistant message item to truncate. Only assistant message  items can be truncated.  */
  itemId: String,
/* The index of the content part to truncate. Set this to 0. */
  contentIndex: Integer,
/* Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.  */
  audioEndMs: Integer)

object RealtimeClientEventConversationItemTruncate {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemTruncate extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemTruncate" => Some(ConversationItemTruncate)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemTruncate => "ConversationItemTruncate"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventConversationItemTruncateCodecJson: CodecJson[RealtimeClientEventConversationItemTruncate] = CodecJson.derive[RealtimeClientEventConversationItemTruncate]
  implicit val RealtimeClientEventConversationItemTruncateDecoder: EntityDecoder[RealtimeClientEventConversationItemTruncate] = jsonOf[RealtimeClientEventConversationItemTruncate]
  implicit val RealtimeClientEventConversationItemTruncateEncoder: EntityEncoder[RealtimeClientEventConversationItemTruncate] = jsonEncoderOf[RealtimeClientEventConversationItemTruncate]
}
