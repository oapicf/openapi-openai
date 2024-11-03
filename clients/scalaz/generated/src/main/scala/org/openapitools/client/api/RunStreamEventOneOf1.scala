package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf1._

case class RunStreamEventOneOf1 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf1 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunQueued extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunQueued" => Some(ThreadRunQueued)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunQueued => "ThreadRunQueued"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf1CodecJson: CodecJson[RunStreamEventOneOf1] = CodecJson.derive[RunStreamEventOneOf1]
  implicit val RunStreamEventOneOf1Decoder: EntityDecoder[RunStreamEventOneOf1] = jsonOf[RunStreamEventOneOf1]
  implicit val RunStreamEventOneOf1Encoder: EntityEncoder[RunStreamEventOneOf1] = jsonEncoderOf[RunStreamEventOneOf1]
}
