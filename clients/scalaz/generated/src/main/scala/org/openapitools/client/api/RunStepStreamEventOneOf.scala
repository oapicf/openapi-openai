package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepStreamEventOneOf._

case class RunStepStreamEventOneOf (
  event: Event,
data: RunStepObject)

object RunStepStreamEventOneOf {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunStepCreated extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunStepCreated" => Some(ThreadRunStepCreated)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunStepCreated => "ThreadRunStepCreated"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStepStreamEventOneOfCodecJson: CodecJson[RunStepStreamEventOneOf] = CodecJson.derive[RunStepStreamEventOneOf]
  implicit val RunStepStreamEventOneOfDecoder: EntityDecoder[RunStepStreamEventOneOf] = jsonOf[RunStepStreamEventOneOf]
  implicit val RunStepStreamEventOneOfEncoder: EntityEncoder[RunStepStreamEventOneOf] = jsonEncoderOf[RunStepStreamEventOneOf]
}
