package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf._

case class RunStreamEventOneOf (
  event: Event,
data: RunObject)

object RunStreamEventOneOf {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunCreated extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunCreated" => Some(ThreadRunCreated)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunCreated => "ThreadRunCreated"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOfCodecJson: CodecJson[RunStreamEventOneOf] = CodecJson.derive[RunStreamEventOneOf]
  implicit val RunStreamEventOneOfDecoder: EntityDecoder[RunStreamEventOneOf] = jsonOf[RunStreamEventOneOf]
  implicit val RunStreamEventOneOfEncoder: EntityEncoder[RunStreamEventOneOf] = jsonEncoderOf[RunStreamEventOneOf]
}
