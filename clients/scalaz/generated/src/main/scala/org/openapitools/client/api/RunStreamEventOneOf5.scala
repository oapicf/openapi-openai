package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf5._

case class RunStreamEventOneOf5 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf5 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunFailed extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunFailed" => Some(ThreadRunFailed)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunFailed => "ThreadRunFailed"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf5CodecJson: CodecJson[RunStreamEventOneOf5] = CodecJson.derive[RunStreamEventOneOf5]
  implicit val RunStreamEventOneOf5Decoder: EntityDecoder[RunStreamEventOneOf5] = jsonOf[RunStreamEventOneOf5]
  implicit val RunStreamEventOneOf5Encoder: EntityEncoder[RunStreamEventOneOf5] = jsonEncoderOf[RunStreamEventOneOf5]
}
