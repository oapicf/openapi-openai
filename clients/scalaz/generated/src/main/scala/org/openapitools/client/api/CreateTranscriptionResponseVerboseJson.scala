package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranscriptionResponseVerboseJson._

case class CreateTranscriptionResponseVerboseJson (
  /* The language of the input audio. */
  language: String,
/* The duration of the input audio. */
  duration: String,
/* The transcribed text. */
  text: String,
/* Extracted words and their corresponding timestamps. */
  words: Option[List[TranscriptionWord]],
/* Segments of the transcribed text and their corresponding details. */
  segments: Option[List[TranscriptionSegment]])

object CreateTranscriptionResponseVerboseJson {
  import DateTimeCodecs._

  implicit val CreateTranscriptionResponseVerboseJsonCodecJson: CodecJson[CreateTranscriptionResponseVerboseJson] = CodecJson.derive[CreateTranscriptionResponseVerboseJson]
  implicit val CreateTranscriptionResponseVerboseJsonDecoder: EntityDecoder[CreateTranscriptionResponseVerboseJson] = jsonOf[CreateTranscriptionResponseVerboseJson]
  implicit val CreateTranscriptionResponseVerboseJsonEncoder: EntityEncoder[CreateTranscriptionResponseVerboseJson] = jsonEncoderOf[CreateTranscriptionResponseVerboseJson]
}
