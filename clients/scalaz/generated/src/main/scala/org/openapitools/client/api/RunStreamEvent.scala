package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEvent._

case class RunStreamEvent (
  event: Event,
data: RunObject)

object RunStreamEvent {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunExpired extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunExpired" => Some(ThreadRunExpired)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunExpired => "ThreadRunExpired"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventCodecJson: CodecJson[RunStreamEvent] = CodecJson.derive[RunStreamEvent]
  implicit val RunStreamEventDecoder: EntityDecoder[RunStreamEvent] = jsonOf[RunStreamEvent]
  implicit val RunStreamEventEncoder: EntityEncoder[RunStreamEvent] = jsonEncoderOf[RunStreamEvent]
}
