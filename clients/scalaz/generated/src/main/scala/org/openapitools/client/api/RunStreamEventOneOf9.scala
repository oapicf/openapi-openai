package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf9._

case class RunStreamEventOneOf9 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf9 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunExpired extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunExpired" => Some(ThreadRunExpired)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunExpired => "ThreadRunExpired"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf9CodecJson: CodecJson[RunStreamEventOneOf9] = CodecJson.derive[RunStreamEventOneOf9]
  implicit val RunStreamEventOneOf9Decoder: EntityDecoder[RunStreamEventOneOf9] = jsonOf[RunStreamEventOneOf9]
  implicit val RunStreamEventOneOf9Encoder: EntityEncoder[RunStreamEventOneOf9] = jsonEncoderOf[RunStreamEventOneOf9]
}
