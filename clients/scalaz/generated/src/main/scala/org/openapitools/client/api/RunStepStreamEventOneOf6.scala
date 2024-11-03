package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf6._

case class RunStepStreamEventOneOf6 (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf6 {
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

  implicit val RunStepStreamEventOneOf6CodecJson: CodecJson[RunStepStreamEventOneOf6] = CodecJson.derive[RunStepStreamEventOneOf6]
  implicit val RunStepStreamEventOneOf6Decoder: EntityDecoder[RunStepStreamEventOneOf6] = jsonOf[RunStepStreamEventOneOf6]
  implicit val RunStepStreamEventOneOf6Encoder: EntityEncoder[RunStepStreamEventOneOf6] = jsonEncoderOf[RunStepStreamEventOneOf6]
}
