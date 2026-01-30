package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventSessionUpdated._

case class RealtimeServerEventSessionUpdated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `session.updated`. */
  `type`: `Type`,
session: RealtimeSession)

object RealtimeServerEventSessionUpdated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object SessionUpdated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "SessionUpdated" => Some(SessionUpdated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case SessionUpdated => "SessionUpdated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventSessionUpdatedCodecJson: CodecJson[RealtimeServerEventSessionUpdated] = CodecJson.derive[RealtimeServerEventSessionUpdated]
  implicit val RealtimeServerEventSessionUpdatedDecoder: EntityDecoder[RealtimeServerEventSessionUpdated] = jsonOf[RealtimeServerEventSessionUpdated]
  implicit val RealtimeServerEventSessionUpdatedEncoder: EntityEncoder[RealtimeServerEventSessionUpdated] = jsonEncoderOf[RealtimeServerEventSessionUpdated]
}
