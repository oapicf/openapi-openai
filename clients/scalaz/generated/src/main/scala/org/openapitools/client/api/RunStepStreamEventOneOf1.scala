package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf1._

case class RunStepStreamEventOneOf1 (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf1 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepInProgress extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepInProgress" => Some(ThreadRunStepInProgress)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepInProgress => "ThreadRunStepInProgress"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOf1CodecJson: CodecJson[RunStepStreamEventOneOf1] = CodecJson.derive[RunStepStreamEventOneOf1]
  implicit val RunStepStreamEventOneOf1Decoder: EntityDecoder[RunStepStreamEventOneOf1] = jsonOf[RunStepStreamEventOneOf1]
  implicit val RunStepStreamEventOneOf1Encoder: EntityEncoder[RunStepStreamEventOneOf1] = jsonEncoderOf[RunStepStreamEventOneOf1]
}
