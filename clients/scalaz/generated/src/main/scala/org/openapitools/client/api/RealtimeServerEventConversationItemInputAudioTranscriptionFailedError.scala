package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventConversationItemInputAudioTranscriptionFailedError._

case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (
  /* The type of error. */
  `type`: Option[String],
/* Error code, if any. */
  code: Option[String],
/* A human-readable error message. */
  message: Option[String],
/* Parameter related to the error, if any. */
  param: Option[String])

object RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
  import DateTimeCodecs._

  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorCodecJson: CodecJson[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = CodecJson.derive[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorDecoder: EntityDecoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = jsonOf[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError]
  implicit val RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorEncoder: EntityEncoder[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = jsonEncoderOf[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError]
}
