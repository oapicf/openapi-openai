package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseCreated._

case class RealtimeServerEventResponseCreated (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.created`. */
  `type`: `Type`,
response: RealtimeResponse)

object RealtimeServerEventResponseCreated {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseCreated extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseCreated" => Some(ResponseCreated)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseCreated => "ResponseCreated"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseCreatedCodecJson: CodecJson[RealtimeServerEventResponseCreated] = CodecJson.derive[RealtimeServerEventResponseCreated]
  implicit val RealtimeServerEventResponseCreatedDecoder: EntityDecoder[RealtimeServerEventResponseCreated] = jsonOf[RealtimeServerEventResponseCreated]
  implicit val RealtimeServerEventResponseCreatedEncoder: EntityEncoder[RealtimeServerEventResponseCreated] = jsonEncoderOf[RealtimeServerEventResponseCreated]
}
