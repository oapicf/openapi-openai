package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventInputAudioBufferAppend._

case class RealtimeClientEventInputAudioBufferAppend (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `input_audio_buffer.append`. */
  `type`: `Type`,
/* Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration.  */
  audio: String)

object RealtimeClientEventInputAudioBufferAppend {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferAppend extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferAppend" => Some(InputAudioBufferAppend)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferAppend => "InputAudioBufferAppend"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventInputAudioBufferAppendCodecJson: CodecJson[RealtimeClientEventInputAudioBufferAppend] = CodecJson.derive[RealtimeClientEventInputAudioBufferAppend]
  implicit val RealtimeClientEventInputAudioBufferAppendDecoder: EntityDecoder[RealtimeClientEventInputAudioBufferAppend] = jsonOf[RealtimeClientEventInputAudioBufferAppend]
  implicit val RealtimeClientEventInputAudioBufferAppendEncoder: EntityEncoder[RealtimeClientEventInputAudioBufferAppend] = jsonEncoderOf[RealtimeClientEventInputAudioBufferAppend]
}
