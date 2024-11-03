package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEventOneOf3._

case class MessageStreamEventOneOf3 (
  event: Event,
data: MessageObject)

object MessageStreamEventOneOf3 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadMessageCompleted extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadMessageCompleted" => Some(ThreadMessageCompleted)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadMessageCompleted => "ThreadMessageCompleted"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val MessageStreamEventOneOf3CodecJson: CodecJson[MessageStreamEventOneOf3] = CodecJson.derive[MessageStreamEventOneOf3]
  implicit val MessageStreamEventOneOf3Decoder: EntityDecoder[MessageStreamEventOneOf3] = jsonOf[MessageStreamEventOneOf3]
  implicit val MessageStreamEventOneOf3Encoder: EntityEncoder[MessageStreamEventOneOf3] = jsonEncoderOf[MessageStreamEventOneOf3]
}
