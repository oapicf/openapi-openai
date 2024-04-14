package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranscriptionResponseJson._

case class CreateTranscriptionResponseJson (
  /* The transcribed text. */
  text: String)

object CreateTranscriptionResponseJson {
  import DateTimeCodecs._

  implicit val CreateTranscriptionResponseJsonCodecJson: CodecJson[CreateTranscriptionResponseJson] = CodecJson.derive[CreateTranscriptionResponseJson]
  implicit val CreateTranscriptionResponseJsonDecoder: EntityDecoder[CreateTranscriptionResponseJson] = jsonOf[CreateTranscriptionResponseJson]
  implicit val CreateTranscriptionResponseJsonEncoder: EntityEncoder[CreateTranscriptionResponseJson] = jsonEncoderOf[CreateTranscriptionResponseJson]
}
