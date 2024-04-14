package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranscription200Response._

case class CreateTranscription200Response (
  /* The transcribed text. */
  text: String,
/* The language of the input audio. */
  language: String,
/* The duration of the input audio. */
  duration: String,
/* Extracted words and their corresponding timestamps. */
  words: Option[List[TranscriptionWord]],
/* Segments of the transcribed text and their corresponding details. */
  segments: Option[List[TranscriptionSegment]])

object CreateTranscription200Response {
  import DateTimeCodecs._

  implicit val CreateTranscription200ResponseCodecJson: CodecJson[CreateTranscription200Response] = CodecJson.derive[CreateTranscription200Response]
  implicit val CreateTranscription200ResponseDecoder: EntityDecoder[CreateTranscription200Response] = jsonOf[CreateTranscription200Response]
  implicit val CreateTranscription200ResponseEncoder: EntityEncoder[CreateTranscription200Response] = jsonEncoderOf[CreateTranscription200Response]
}
