package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf4._

case class RunStreamEventOneOf4 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf4 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunCompleted extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunCompleted" => Some(ThreadRunCompleted)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunCompleted => "ThreadRunCompleted"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf4CodecJson: CodecJson[RunStreamEventOneOf4] = CodecJson.derive[RunStreamEventOneOf4]
  implicit val RunStreamEventOneOf4Decoder: EntityDecoder[RunStreamEventOneOf4] = jsonOf[RunStreamEventOneOf4]
  implicit val RunStreamEventOneOf4Encoder: EntityEncoder[RunStreamEventOneOf4] = jsonEncoderOf[RunStreamEventOneOf4]
}
