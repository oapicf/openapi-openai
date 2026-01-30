package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf8._

case class RunStreamEventOneOf8 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf8 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunCancelled extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunCancelled" => Some(ThreadRunCancelled)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunCancelled => "ThreadRunCancelled"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf8CodecJson: CodecJson[RunStreamEventOneOf8] = CodecJson.derive[RunStreamEventOneOf8]
  implicit val RunStreamEventOneOf8Decoder: EntityDecoder[RunStreamEventOneOf8] = jsonOf[RunStreamEventOneOf8]
  implicit val RunStreamEventOneOf8Encoder: EntityEncoder[RunStreamEventOneOf8] = jsonEncoderOf[RunStreamEventOneOf8]
}
