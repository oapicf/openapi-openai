package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventInputAudioBufferCommitted._

case class RealtimeServerEventInputAudioBufferCommitted (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `input_audio_buffer.committed`. */
  `type`: `Type`,
/* The ID of the preceding item after which the new item will be inserted.  */
  previousItemId: String,
/* The ID of the user message item that will be created. */
  itemId: String)

object RealtimeServerEventInputAudioBufferCommitted {
  import DateTimeCodecs._
  sealed trait `Type`
  case object InputAudioBufferCommitted extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "InputAudioBufferCommitted" => Some(InputAudioBufferCommitted)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case InputAudioBufferCommitted => "InputAudioBufferCommitted"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventInputAudioBufferCommittedCodecJson: CodecJson[RealtimeServerEventInputAudioBufferCommitted] = CodecJson.derive[RealtimeServerEventInputAudioBufferCommitted]
  implicit val RealtimeServerEventInputAudioBufferCommittedDecoder: EntityDecoder[RealtimeServerEventInputAudioBufferCommitted] = jsonOf[RealtimeServerEventInputAudioBufferCommitted]
  implicit val RealtimeServerEventInputAudioBufferCommittedEncoder: EntityEncoder[RealtimeServerEventInputAudioBufferCommitted] = jsonEncoderOf[RealtimeServerEventInputAudioBufferCommitted]
}
