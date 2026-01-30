package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventInputAudioBufferCleared._

case class RealtimeServerEventInputAudioBufferCleared (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `input_audio_buffer.cleared`. */
  `type`: `Type`)

object RealtimeServerEventInputAudioBufferCleared {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferCleared extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferCleared" => Some(InputAudioBufferCleared)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferCleared => "InputAudioBufferCleared"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventInputAudioBufferClearedCodecJson: CodecJson[RealtimeServerEventInputAudioBufferCleared] = CodecJson.derive[RealtimeServerEventInputAudioBufferCleared]
  implicit val RealtimeServerEventInputAudioBufferClearedDecoder: EntityDecoder[RealtimeServerEventInputAudioBufferCleared] = jsonOf[RealtimeServerEventInputAudioBufferCleared]
  implicit val RealtimeServerEventInputAudioBufferClearedEncoder: EntityEncoder[RealtimeServerEventInputAudioBufferCleared] = jsonEncoderOf[RealtimeServerEventInputAudioBufferCleared]
}
