package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventSessionCreated._

case class RealtimeServerEventSessionCreated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `session.created`. */
  `type`: `Type`,
session: RealtimeSession)

object RealtimeServerEventSessionCreated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object SessionCreated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "SessionCreated" => Some(SessionCreated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case SessionCreated => "SessionCreated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventSessionCreatedCodecJson: CodecJson[RealtimeServerEventSessionCreated] = CodecJson.derive[RealtimeServerEventSessionCreated]
  implicit val RealtimeServerEventSessionCreatedDecoder: EntityDecoder[RealtimeServerEventSessionCreated] = jsonOf[RealtimeServerEventSessionCreated]
  implicit val RealtimeServerEventSessionCreatedEncoder: EntityEncoder[RealtimeServerEventSessionCreated] = jsonEncoderOf[RealtimeServerEventSessionCreated]
}
