package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventResponseCancel._

case class RealtimeClientEventResponseCancel (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `response.cancel`. */
  `type`: `Type`,
/* A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  */
  responseId: Option[String])

object RealtimeClientEventResponseCancel {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseCancel extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseCancel" => Some(ResponseCancel)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseCancel => "ResponseCancel"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventResponseCancelCodecJson: CodecJson[RealtimeClientEventResponseCancel] = CodecJson.derive[RealtimeClientEventResponseCancel]
  implicit val RealtimeClientEventResponseCancelDecoder: EntityDecoder[RealtimeClientEventResponseCancel] = jsonOf[RealtimeClientEventResponseCancel]
  implicit val RealtimeClientEventResponseCancelEncoder: EntityEncoder[RealtimeClientEventResponseCancel] = jsonEncoderOf[RealtimeClientEventResponseCancel]
}
