package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf5._

case class RunStepStreamEventOneOf5 (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf5 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepCancelled extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepCancelled" => Some(ThreadRunStepCancelled)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepCancelled => "ThreadRunStepCancelled"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOf5CodecJson: CodecJson[RunStepStreamEventOneOf5] = CodecJson.derive[RunStepStreamEventOneOf5]
  implicit val RunStepStreamEventOneOf5Decoder: EntityDecoder[RunStepStreamEventOneOf5] = jsonOf[RunStepStreamEventOneOf5]
  implicit val RunStepStreamEventOneOf5Encoder: EntityEncoder[RunStepStreamEventOneOf5] = jsonEncoderOf[RunStepStreamEventOneOf5]
}
