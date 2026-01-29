package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEventOneOf._

case class MessageStreamEventOneOf (
  event: Event,
data: MessageObject)

object MessageStreamEventOneOf {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadMessageCreated extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadMessageCreated" => Some(ThreadMessageCreated)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadMessageCreated => "ThreadMessageCreated"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val MessageStreamEventOneOfCodecJson: CodecJson[MessageStreamEventOneOf] = CodecJson.derive[MessageStreamEventOneOf]
  implicit val MessageStreamEventOneOfDecoder: EntityDecoder[MessageStreamEventOneOf] = jsonOf[MessageStreamEventOneOf]
  implicit val MessageStreamEventOneOfEncoder: EntityEncoder[MessageStreamEventOneOf] = jsonEncoderOf[MessageStreamEventOneOf]
}
