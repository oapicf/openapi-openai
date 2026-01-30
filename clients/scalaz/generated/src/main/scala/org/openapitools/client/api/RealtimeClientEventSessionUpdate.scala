package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventSessionUpdate._

case class RealtimeClientEventSessionUpdate (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `session.update`. */
  `type`: `Type`,
session: RealtimeSessionCreateRequest)

object RealtimeClientEventSessionUpdate {
  import DateTimeCodecs._
  sealed trait `Type`
  case object SessionUpdate extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "SessionUpdate" => Some(SessionUpdate)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case SessionUpdate => "SessionUpdate"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventSessionUpdateCodecJson: CodecJson[RealtimeClientEventSessionUpdate] = CodecJson.derive[RealtimeClientEventSessionUpdate]
  implicit val RealtimeClientEventSessionUpdateDecoder: EntityDecoder[RealtimeClientEventSessionUpdate] = jsonOf[RealtimeClientEventSessionUpdate]
  implicit val RealtimeClientEventSessionUpdateEncoder: EntityEncoder[RealtimeClientEventSessionUpdate] = jsonEncoderOf[RealtimeClientEventSessionUpdate]
}
