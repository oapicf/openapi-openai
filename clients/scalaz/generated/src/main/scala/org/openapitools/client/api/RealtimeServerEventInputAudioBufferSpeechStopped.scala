package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventInputAudioBufferSpeechStopped._

case class RealtimeServerEventInputAudioBufferSpeechStopped (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `input_audio_buffer.speech_stopped`. */
  `type`: `Type`,
/* Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session.  */
  audioEndMs: Integer,
/* The ID of the user message item that will be created. */
  itemId: String)

object RealtimeServerEventInputAudioBufferSpeechStopped {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferSpeechStopped extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferSpeechStopped" => Some(InputAudioBufferSpeechStopped)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferSpeechStopped => "InputAudioBufferSpeechStopped"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventInputAudioBufferSpeechStoppedCodecJson: CodecJson[RealtimeServerEventInputAudioBufferSpeechStopped] = CodecJson.derive[RealtimeServerEventInputAudioBufferSpeechStopped]
  implicit val RealtimeServerEventInputAudioBufferSpeechStoppedDecoder: EntityDecoder[RealtimeServerEventInputAudioBufferSpeechStopped] = jsonOf[RealtimeServerEventInputAudioBufferSpeechStopped]
  implicit val RealtimeServerEventInputAudioBufferSpeechStoppedEncoder: EntityEncoder[RealtimeServerEventInputAudioBufferSpeechStopped] = jsonEncoderOf[RealtimeServerEventInputAudioBufferSpeechStopped]
}
