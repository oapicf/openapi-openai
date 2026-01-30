package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionInputAudioTranscription._

case class RealtimeSessionInputAudioTranscription (
  /* The model to use for transcription, `whisper-1` is the only currently  supported model.  */
  model: Option[String])

object RealtimeSessionInputAudioTranscription {
  import DateTimeCodecs._

  implicit val RealtimeSessionInputAudioTranscriptionCodecJson: CodecJson[RealtimeSessionInputAudioTranscription] = CodecJson.derive[RealtimeSessionInputAudioTranscription]
  implicit val RealtimeSessionInputAudioTranscriptionDecoder: EntityDecoder[RealtimeSessionInputAudioTranscription] = jsonOf[RealtimeSessionInputAudioTranscription]
  implicit val RealtimeSessionInputAudioTranscriptionEncoder: EntityEncoder[RealtimeSessionInputAudioTranscription] = jsonEncoderOf[RealtimeSessionInputAudioTranscription]
}
