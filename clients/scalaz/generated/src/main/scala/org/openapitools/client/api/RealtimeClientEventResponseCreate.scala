package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventResponseCreate._

case class RealtimeClientEventResponseCreate (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `response.create`. */
  `type`: `Type`,
response: Option[RealtimeResponseCreateParams])

object RealtimeClientEventResponseCreate {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseCreate extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseCreate" => Some(ResponseCreate)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseCreate => "ResponseCreate"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventResponseCreateCodecJson: CodecJson[RealtimeClientEventResponseCreate] = CodecJson.derive[RealtimeClientEventResponseCreate]
  implicit val RealtimeClientEventResponseCreateDecoder: EntityDecoder[RealtimeClientEventResponseCreate] = jsonOf[RealtimeClientEventResponseCreate]
  implicit val RealtimeClientEventResponseCreateEncoder: EntityEncoder[RealtimeClientEventResponseCreate] = jsonEncoderOf[RealtimeClientEventResponseCreate]
}
