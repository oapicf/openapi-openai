package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageStreamEventOneOf2._

case class MessageStreamEventOneOf2 (
  event: Event,
data: MessageDeltaObject)

object MessageStreamEventOneOf2 {
  import DateTimeCodecs._
  sealed trait Event
  case object ThreadMessageDelta extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "ThreadMessageDelta" => Some(ThreadMessageDelta)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case ThreadMessageDelta => "ThreadMessageDelta"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")

  implicit val MessageStreamEventOneOf2CodecJson: CodecJson[MessageStreamEventOneOf2] = CodecJson.derive[MessageStreamEventOneOf2]
  implicit val MessageStreamEventOneOf2Decoder: EntityDecoder[MessageStreamEventOneOf2] = jsonOf[MessageStreamEventOneOf2]
  implicit val MessageStreamEventOneOf2Encoder: EntityEncoder[MessageStreamEventOneOf2] = jsonEncoderOf[MessageStreamEventOneOf2]
}
