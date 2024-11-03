package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranslation200Response._

case class CreateTranslation200Response (
  /* The translated text. */
  text: String,
/* The language of the output translation (always `english`). */
  language: String,
/* The duration of the input audio. */
  duration: String,
/* Segments of the translated text and their corresponding details. */
  segments: Option[List[TranscriptionSegment]])

object CreateTranslation200Response {
  import DateTimeCodecs._

  implicit val CreateTranslation200ResponseCodecJson: CodecJson[CreateTranslation200Response] = CodecJson.derive[CreateTranslation200Response]
  implicit val CreateTranslation200ResponseDecoder: EntityDecoder[CreateTranslation200Response] = jsonOf[CreateTranslation200Response]
  implicit val CreateTranslation200ResponseEncoder: EntityEncoder[CreateTranslation200Response] = jsonEncoderOf[CreateTranslation200Response]
}
