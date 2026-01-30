package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemInputAudioTranscriptionCompleted._

case class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted (
  /* The unique ID of the server event. */
  eventId: String,
/* The event type, must be `conversation.item.input_audio_transcription.completed`.  */
  `type`: `Type`,
/* The ID of the user message item containing the audio. */
  itemId: String,
/* The index of the content part containing the audio. */
  contentIndex: Integer,
/* The transcribed text. */
  transcript: String)

object RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ConversationItemInputAudioTranscriptionCompleted extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ConversationItemInputAudioTranscriptionCompleted" => Some(ConversationItemInputAudioTranscriptionCompleted)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ConversationItemInputAudioTranscriptionCompleted => "ConversationItemInputAudioTranscriptionCompleted"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionCompletedCodecJson: CodecJson[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = CodecJson.derive[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionCompletedDecoder: EntityDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = jsonOf[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionCompletedEncoder: EntityEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted] = jsonEncoderOf[RealtimeServerEventConversationItemInputAudioTranscriptionCompleted]
}
