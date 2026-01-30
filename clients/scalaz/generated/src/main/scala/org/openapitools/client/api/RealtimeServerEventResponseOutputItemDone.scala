package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseOutputItemDone._

case class RealtimeServerEventResponseOutputItemDone (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.output_item.done`. */
  `type`: `Type`,
/* The ID of the Response to which the item belongs. */
  responseId: String,
/* The index of the output item in the Response. */
  outputIndex: Integer,
item: RealtimeConversationItem)

object RealtimeServerEventResponseOutputItemDone {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseOutputItemDone extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseOutputItemDone" => Some(ResponseOutputItemDone)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseOutputItemDone => "ResponseOutputItemDone"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseOutputItemDoneCodecJson: CodecJson[RealtimeServerEventResponseOutputItemDone] = CodecJson.derive[RealtimeServerEventResponseOutputItemDone]
  implicit val RealtimeServerEventResponseOutputItemDoneDecoder: EntityDecoder[RealtimeServerEventResponseOutputItemDone] = jsonOf[RealtimeServerEventResponseOutputItemDone]
  implicit val RealtimeServerEventResponseOutputItemDoneEncoder: EntityEncoder[RealtimeServerEventResponseOutputItemDone] = jsonEncoderOf[RealtimeServerEventResponseOutputItemDone]
}
