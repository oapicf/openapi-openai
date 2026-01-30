package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemInputAudioTranscriptionFailed._

case class RealtimeServerEventConversationItemInputAudioTranscriptionFailed (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.item.input_audio_transcription.failed`.  */
  `type`: `Type`,
/* The ID of the user message item. */
  itemId: String,
/* The index of the content part containing the audio. */
  contentIndex: Integer,
error: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError)

object RealtimeServerEventConversationItemInputAudioTranscriptionFailed {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemInputAudioTranscriptionFailed extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemInputAudioTranscriptionFailed" => Some(ConversationItemInputAudioTranscriptionFailed)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemInputAudioTranscriptionFailed => "ConversationItemInputAudioTranscriptionFailed"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedCodecJson: CodecJson[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = CodecJson.derive[RealtimeServerEventConversationItemInputAudioTranscriptionFailed]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedDecoder: EntityDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = jsonOf[RealtimeServerEventConversationItemInputAudioTranscriptionFailed]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedEncoder: EntityEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailed] = jsonEncoderOf[RealtimeServerEventConversationItemInputAudioTranscriptionFailed]
}
