package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseAudioDone._

case class RealtimeServerEventResponseAudioDone (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.audio.done`. */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the item. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The index of the content part in the item's content array. */
  contentIndex: Integer)

object RealtimeServerEventResponseAudioDone {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseAudioDone extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseAudioDone" => Some(ResponseAudioDone)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseAudioDone => "ResponseAudioDone"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseAudioDoneCodecJson: CodecJson[RealtimeServerEventResponseAudioDone] = CodecJson.derive[RealtimeServerEventResponseAudioDone]
  implicit val RealtimeServerEventResponseAudioDoneDecoder: EntityDecoder[RealtimeServerEventResponseAudioDone] = jsonOf[RealtimeServerEventResponseAudioDone]
  implicit val RealtimeServerEventResponseAudioDoneEncoder: EntityEncoder[RealtimeServerEventResponseAudioDone] = jsonEncoderOf[RealtimeServerEventResponseAudioDone]
}
