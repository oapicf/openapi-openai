package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEventOneOf1._

case class MessageStreamEventOneOf1 (
  event: Event,
data: MessageObject)

object MessageStreamEventOneOf1 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadMessageInProgress extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadMessageInProgress" => Some(ThreadMessageInProgress)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadMessageInProgress => "ThreadMessageInProgress"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val MessageStreamEventOneOf1CodecJson: CodecJson[MessageStreamEventOneOf1] = CodecJson.derive[MessageStreamEventOneOf1]
  implicit val MessageStreamEventOneOf1Decoder: EntityDecoder[MessageStreamEventOneOf1] = jsonOf[MessageStreamEventOneOf1]
  implicit val MessageStreamEventOneOf1Encoder: EntityEncoder[MessageStreamEventOneOf1] = jsonEncoderOf[MessageStreamEventOneOf1]
}
