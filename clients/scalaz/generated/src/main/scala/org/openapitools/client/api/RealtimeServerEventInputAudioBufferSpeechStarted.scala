package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventInputAudioBufferSpeechStarted._

case class RealtimeServerEventInputAudioBufferSpeechStarted (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `input_audio_buffer.speech_started`. */
  `type`: `Type`,
/* Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session.  */
  audioStartMs: Integer,
/* The ID of the user message item that will be created when speech stops.  */
  itemId: String)

object RealtimeServerEventInputAudioBufferSpeechStarted {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferSpeechStarted extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferSpeechStarted" => Some(InputAudioBufferSpeechStarted)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferSpeechStarted => "InputAudioBufferSpeechStarted"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventInputAudioBufferSpeechStartedCodecJson: CodecJson[RealtimeServerEventInputAudioBufferSpeechStarted] = CodecJson.derive[RealtimeServerEventInputAudioBufferSpeechStarted]
  implicit val RealtimeServerEventInputAudioBufferSpeechStartedDecoder: EntityDecoder[RealtimeServerEventInputAudioBufferSpeechStarted] = jsonOf[RealtimeServerEventInputAudioBufferSpeechStarted]
  implicit val RealtimeServerEventInputAudioBufferSpeechStartedEncoder: EntityEncoder[RealtimeServerEventInputAudioBufferSpeechStarted] = jsonEncoderOf[RealtimeServerEventInputAudioBufferSpeechStarted]
}
