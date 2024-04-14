package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ErrorEvent._

case class ErrorEvent (
  event: Event,
data: Error)

object ErrorEvent {
  import DateTimeCodecs._
  sealed trait Event
  case object Error extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "Error" => Some(Error)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case Error => "Error"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val ErrorEventCodecJson: CodecJson[ErrorEvent] = CodecJson.derive[ErrorEvent]
  implicit val ErrorEventDecoder: EntityDecoder[ErrorEvent] = jsonOf[ErrorEvent]
  implicit val ErrorEventEncoder: EntityEncoder[ErrorEvent] = jsonEncoderOf[ErrorEvent]
}
