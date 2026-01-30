package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseOutputItemAdded._

case class RealtimeServerEventResponseOutputItemAdded (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.output_item.added`. */
  `type`: `Type`,
/* The ID of the Response to which the item belongs. */
  responseId: String,
/* The index of the output item in the Response. */
  outputIndex: Integer,
item: RealtimeConversationItem)

object RealtimeServerEventResponseOutputItemAdded {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseOutputItemAdded extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseOutputItemAdded" => Some(ResponseOutputItemAdded)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseOutputItemAdded => "ResponseOutputItemAdded"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseOutputItemAddedCodecJson: CodecJson[RealtimeServerEventResponseOutputItemAdded] = CodecJson.derive[RealtimeServerEventResponseOutputItemAdded]
  implicit val RealtimeServerEventResponseOutputItemAddedDecoder: EntityDecoder[RealtimeServerEventResponseOutputItemAdded] = jsonOf[RealtimeServerEventResponseOutputItemAdded]
  implicit val RealtimeServerEventResponseOutputItemAddedEncoder: EntityEncoder[RealtimeServerEventResponseOutputItemAdded] = jsonEncoderOf[RealtimeServerEventResponseOutputItemAdded]
}
