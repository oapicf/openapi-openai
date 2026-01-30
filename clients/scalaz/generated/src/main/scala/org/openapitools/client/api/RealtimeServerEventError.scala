package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventError._

case class RealtimeServerEventError (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `error`. */
  `type`: `Type`,
error: RealtimeServerEventErrorError)

object RealtimeServerEventError {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Error extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Error" => Some(Error)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Error => "Error"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventErrorCodecJson: CodecJson[RealtimeServerEventError] = CodecJson.derive[RealtimeServerEventError]
  implicit val RealtimeServerEventErrorDecoder: EntityDecoder[RealtimeServerEventError] = jsonOf[RealtimeServerEventError]
  implicit val RealtimeServerEventErrorEncoder: EntityEncoder[RealtimeServerEventError] = jsonEncoderOf[RealtimeServerEventError]
}
