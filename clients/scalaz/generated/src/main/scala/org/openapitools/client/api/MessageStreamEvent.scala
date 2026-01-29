package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEvent._

case class MessageStreamEvent (
  event: Event,
data: MessageObject)

object MessageStreamEvent {
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

  implicit val MessageStreamEventCodecJson: CodecJson[MessageStreamEvent] = CodecJson.derive[MessageStreamEvent]
  implicit val MessageStreamEventDecoder: EntityDecoder[MessageStreamEvent] = jsonOf[MessageStreamEvent]
  implicit val MessageStreamEventEncoder: EntityEncoder[MessageStreamEvent] = jsonEncoderOf[MessageStreamEvent]
}
