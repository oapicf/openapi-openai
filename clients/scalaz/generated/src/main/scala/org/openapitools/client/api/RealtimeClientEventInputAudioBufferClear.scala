package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeClientEventInputAudioBufferClear._

case class RealtimeClientEventInputAudioBufferClear (
  /* Optional client-generated ID used to identify this event. */
  eventId: Option[String],
/* The event type, must be `input_audio_buffer.clear`. */
  `type`: `Type`)

object RealtimeClientEventInputAudioBufferClear {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferClear extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferClear" => Some(InputAudioBufferClear)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferClear => "InputAudioBufferClear"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeClientEventInputAudioBufferClearCodecJson: CodecJson[RealtimeClientEventInputAudioBufferClear] = CodecJson.derive[RealtimeClientEventInputAudioBufferClear]
  implicit val RealtimeClientEventInputAudioBufferClearDecoder: EntityDecoder[RealtimeClientEventInputAudioBufferClear] = jsonOf[RealtimeClientEventInputAudioBufferClear]
  implicit val RealtimeClientEventInputAudioBufferClearEncoder: EntityEncoder[RealtimeClientEventInputAudioBufferClear] = jsonEncoderOf[RealtimeClientEventInputAudioBufferClear]
}
