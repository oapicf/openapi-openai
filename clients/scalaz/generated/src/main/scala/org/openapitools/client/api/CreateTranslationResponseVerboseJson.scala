package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranslationResponseVerboseJson._

case class CreateTranslationResponseVerboseJson (
  /* The language of the output translation (always `english`). */
  language: String,
/* The duration of the input audio. */
  duration: String,
/* The translated text. */
  text: String,
/* Segments of the translated text and their corresponding details. */
  segments: Option[List[TranscriptionSegment]])

object CreateTranslationResponseVerboseJson {
  import DateTimeCodecs._

  implicit val CreateTranslationResponseVerboseJsonCodecJson: CodecJson[CreateTranslationResponseVerboseJson] = CodecJson.derive[CreateTranslationResponseVerboseJson]
  implicit val CreateTranslationResponseVerboseJsonDecoder: EntityDecoder[CreateTranslationResponseVerboseJson] = jsonOf[CreateTranslationResponseVerboseJson]
  implicit val CreateTranslationResponseVerboseJsonEncoder: EntityEncoder[CreateTranslationResponseVerboseJson] = jsonEncoderOf[CreateTranslationResponseVerboseJson]
}
