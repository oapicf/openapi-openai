package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStreamEventOneOf3._

case class RunStreamEventOneOf3 (
  event: Event,
data: RunObject)

object RunStreamEventOneOf3 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadRunRequiresAction extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadRunRequiresAction" => Some(ThreadRunRequiresAction)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadRunRequiresAction => "ThreadRunRequiresAction"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val RunStreamEventOneOf3CodecJson: CodecJson[RunStreamEventOneOf3] = CodecJson.derive[RunStreamEventOneOf3]
  implicit val RunStreamEventOneOf3Decoder: EntityDecoder[RunStreamEventOneOf3] = jsonOf[RunStreamEventOneOf3]
  implicit val RunStreamEventOneOf3Encoder: EntityEncoder[RunStreamEventOneOf3] = jsonEncoderOf[RunStreamEventOneOf3]
}
