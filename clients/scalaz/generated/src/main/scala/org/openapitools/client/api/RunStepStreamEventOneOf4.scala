package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf4._

case class RunStepStreamEventOneOf4 (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf4 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepFailed extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepFailed" => Some(ThreadRunStepFailed)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepFailed => "ThreadRunStepFailed"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOf4CodecJson: CodecJson[RunStepStreamEventOneOf4] = CodecJson.derive[RunStepStreamEventOneOf4]
  implicit val RunStepStreamEventOneOf4Decoder: EntityDecoder[RunStepStreamEventOneOf4] = jsonOf[RunStepStreamEventOneOf4]
  implicit val RunStepStreamEventOneOf4Encoder: EntityEncoder[RunStepStreamEventOneOf4] = jsonEncoderOf[RunStepStreamEventOneOf4]
}
