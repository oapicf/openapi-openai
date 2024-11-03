package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEventOneOf4._

case class MessageStreamEventOneOf4 (
  event: Event,
data: MessageObject)

object MessageStreamEventOneOf4 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadMessageIncomplete extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadMessageIncomplete" => Some(ThreadMessageIncomplete)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadMessageIncomplete => "ThreadMessageIncomplete"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val MessageStreamEventOneOf4CodecJson: CodecJson[MessageStreamEventOneOf4] = CodecJson.derive[MessageStreamEventOneOf4]
  implicit val MessageStreamEventOneOf4Decoder: EntityDecoder[MessageStreamEventOneOf4] = jsonOf[MessageStreamEventOneOf4]
  implicit val MessageStreamEventOneOf4Encoder: EntityEncoder[MessageStreamEventOneOf4] = jsonEncoderOf[MessageStreamEventOneOf4]
}
