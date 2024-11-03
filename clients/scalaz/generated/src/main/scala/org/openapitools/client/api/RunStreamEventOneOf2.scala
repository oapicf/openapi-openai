package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf2._

case class RunStreamEventOneOf2 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf2 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunInProgress extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunInProgress" => Some(ThreadRunInProgress)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunInProgress => "ThreadRunInProgress"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf2CodecJson: CodecJson[RunStreamEventOneOf2] = CodecJson.derive[RunStreamEventOneOf2]
  implicit val RunStreamEventOneOf2Decoder: EntityDecoder[RunStreamEventOneOf2] = jsonOf[RunStreamEventOneOf2]
  implicit val RunStreamEventOneOf2Encoder: EntityEncoder[RunStreamEventOneOf2] = jsonEncoderOf[RunStreamEventOneOf2]
}
