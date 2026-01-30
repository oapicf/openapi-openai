package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventResponseAudioTranscriptDelta._

case class RealtimeServerEventResponseAudioTranscriptDelta (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `response.audio_transcript.delta`. */
  `type`: `Type`,
/* The ID of the response. */
  responseId: String,
/* The ID of the item. */
  itemId: String,
/* The index of the output item in the response. */
  outputIndex: Integer,
/* The index of the content part in the item's content array. */
  contentIndex: Integer,
/* The transcript delta. */
  delta: String)

object RealtimeServerEventResponseAudioTranscriptDelta {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ResponseAudioTranscriptDelta extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ResponseAudioTranscriptDelta" => Some(ResponseAudioTranscriptDelta)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ResponseAudioTranscriptDelta => "ResponseAudioTranscriptDelta"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventResponseAudioTranscriptDeltaCodecJson: CodecJson[RealtimeServerEventResponseAudioTranscriptDelta] = CodecJson.derive[RealtimeServerEventResponseAudioTranscriptDelta]
  implicit val RealtimeServerEventResponseAudioTranscriptDeltaDecoder: EntityDecoder[RealtimeServerEventResponseAudioTranscriptDelta] = jsonOf[RealtimeServerEventResponseAudioTranscriptDelta]
  implicit val RealtimeServerEventResponseAudioTranscriptDeltaEncoder: EntityEncoder[RealtimeServerEventResponseAudioTranscriptDelta] = jsonEncoderOf[RealtimeServerEventResponseAudioTranscriptDelta]
}
