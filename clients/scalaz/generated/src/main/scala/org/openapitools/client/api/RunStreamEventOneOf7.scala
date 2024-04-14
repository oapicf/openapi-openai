package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf7._

case class RunStreamEventOneOf7 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf7 {
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

  implicit val RunStreamEventOneOf7CodecJson: CodecJson[RunStreamEventOneOf7] = CodecJson.derive[RunStreamEventOneOf7]
  implicit val RunStreamEventOneOf7Decoder: EntityDecoder[RunStreamEventOneOf7] = jsonOf[RunStreamEventOneOf7]
  implicit val RunStreamEventOneOf7Encoder: EntityEncoder[RunStreamEventOneOf7] = jsonEncoderOf[RunStreamEventOneOf7]
}
