package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf2._

case class RunStepStreamEventOneOf2 (
  event: Event,
data: RunStepDeltaObject)

object RunStepStreamEventOneOf2 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepDelta extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepDelta" => Some(ThreadRunStepDelta)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepDelta => "ThreadRunStepDelta"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOf2CodecJson: CodecJson[RunStepStreamEventOneOf2] = CodecJson.derive[RunStepStreamEventOneOf2]
  implicit val RunStepStreamEventOneOf2Decoder: EntityDecoder[RunStepStreamEventOneOf2] = jsonOf[RunStepStreamEventOneOf2]
  implicit val RunStepStreamEventOneOf2Encoder: EntityEncoder[RunStepStreamEventOneOf2] = jsonEncoderOf[RunStepStreamEventOneOf2]
}
