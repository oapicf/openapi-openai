package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEvent._

case class RunStepStreamEvent (
  event: Event,
data: RunStepObject)

object RunStepStreamEvent {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepExpired extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepExpired" => Some(ThreadRunStepExpired)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepExpired => "ThreadRunStepExpired"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventCodecJson: CodecJson[RunStepStreamEvent] = CodecJson.derive[RunStepStreamEvent]
  implicit val RunStepStreamEventDecoder: EntityDecoder[RunStepStreamEvent] = jsonOf[RunStepStreamEvent]
  implicit val RunStepStreamEventEncoder: EntityEncoder[RunStepStreamEvent] = jsonEncoderOf[RunStepStreamEvent]
}
