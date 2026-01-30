package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseContentPartAdded._

case class RealtimeServerEventResponseContentPartAdded (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.content_part.added`. */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the item to which the content part was added. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The index of the content part in the item's content array. */
  contentIndex: Integer,
part: RealtimeServerEventResponseContentPartAddedPart)

object RealtimeServerEventResponseContentPartAdded {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseContentPartAdded extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseContentPartAdded" => Some(ResponseContentPartAdded)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseContentPartAdded => "ResponseContentPartAdded"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseContentPartAddedCodecJson: CodecJson[RealtimeServerEventResponseContentPartAdded] = CodecJson.derive[RealtimeServerEventResponseContentPartAdded]
  implicit val RealtimeServerEventResponseContentPartAddedDecoder: EntityDecoder[RealtimeServerEventResponseContentPartAdded] = jsonOf[RealtimeServerEventResponseContentPartAdded]
  implicit val RealtimeServerEventResponseContentPartAddedEncoder: EntityEncoder[RealtimeServerEventResponseContentPartAdded] = jsonEncoderOf[RealtimeServerEventResponseContentPartAdded]
}
