package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DoneEvent._

case class DoneEvent (
  event: Event,
data: Data)

object DoneEvent {
  import DateTimeCodecs._
  sealed trait Event
  case object Done extends Event

  object Event {
    def toEvent(s: String): Option[Event] = s match {
      case "Done" => Some(Done)
      case _ => None
    }

    def fromEvent(x: Event): String = x match {
      case Done => "Done"
    }
  }

  implicit val EventEnumEncoder: EncodeJson[Event] =
    EncodeJson[Event](is => StringEncodeJson(Event.fromEvent(is)))

  implicit val EventEnumDecoder: DecodeJson[Event] =
    DecodeJson.optionDecoder[Event](n => n.string.flatMap(jStr => Event.toEvent(jStr)), "Event failed to de-serialize")
  sealed trait Data
  case object DONE extends Data

  object Data {
    def toData(s: String): Option[Data] = s match {
      case "DONE" => Some(DONE)
      case _ => None
    }

    def fromData(x: Data): String = x match {
      case DONE => "DONE"
    }
  }

  implicit val DataEnumEncoder: EncodeJson[Data] =
    EncodeJson[Data](is => StringEncodeJson(Data.fromData(is)))

  implicit val DataEnumDecoder: DecodeJson[Data] =
    DecodeJson.optionDecoder[Data](n => n.string.flatMap(jStr => Data.toData(jStr)), "Data failed to de-serialize")

  implicit val DoneEventCodecJson: CodecJson[DoneEvent] = CodecJson.derive[DoneEvent]
  implicit val DoneEventDecoder: EntityDecoder[DoneEvent] = jsonOf[DoneEvent]
  implicit val DoneEventEncoder: EntityEncoder[DoneEvent] = jsonEncoderOf[DoneEvent]
}
