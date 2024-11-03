package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf3._

case class RunStepStreamEventOneOf3 (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf3 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepCompleted extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepCompleted" => Some(ThreadRunStepCompleted)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepCompleted => "ThreadRunStepCompleted"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOf3CodecJson: CodecJson[RunStepStreamEventOneOf3] = CodecJson.derive[RunStepStreamEventOneOf3]
  implicit val RunStepStreamEventOneOf3Decoder: EntityDecoder[RunStepStreamEventOneOf3] = jsonOf[RunStepStreamEventOneOf3]
  implicit val RunStepStreamEventOneOf3Encoder: EntityEncoder[RunStepStreamEventOneOf3] = jsonEncoderOf[RunStepStreamEventOneOf3]
}
