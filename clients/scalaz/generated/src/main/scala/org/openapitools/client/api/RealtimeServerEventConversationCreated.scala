package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationCreated._

case class RealtimeServerEventConversationCreated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.created`. */
  `type`: `Type`,
conversation: RealtimeServerEventConversationCreatedConversation)

object RealtimeServerEventConversationCreated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationCreated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationCreated" => Some(ConversationCreated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationCreated => "ConversationCreated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationCreatedCodecJson: CodecJson[RealtimeServerEventConversationCreated] = CodecJson.derive[RealtimeServerEventConversationCreated]
  implicit val RealtimeServerEventConversationCreatedDecoder: EntityDecoder[RealtimeServerEventConversationCreated] = jsonOf[RealtimeServerEventConversationCreated]
  implicit val RealtimeServerEventConversationCreatedEncoder: EntityEncoder[RealtimeServerEventConversationCreated] = jsonEncoderOf[RealtimeServerEventConversationCreated]
}
