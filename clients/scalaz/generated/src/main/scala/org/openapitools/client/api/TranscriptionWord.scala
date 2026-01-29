package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TranscriptionWord._

case class TranscriptionWord (
  /* The text content of the word. */
  word: String,
/* Start time of the word in seconds. */
  start: Float,
/* End time of the word in seconds. */
  end: Float)

object TranscriptionWord {
  import DateTimeCodecs._

  implicit val TranscriptionWordCodecJson: CodecJson[TranscriptionWord] = CodecJson.derive[TranscriptionWord]
  implicit val TranscriptionWordDecoder: EntityDecoder[TranscriptionWord] = jsonOf[TranscriptionWord]
  implicit val TranscriptionWordEncoder: EntityEncoder[TranscriptionWord] = jsonEncoderOf[TranscriptionWord]
}
