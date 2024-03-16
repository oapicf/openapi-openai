package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranscriptionResponse._

case class CreateTranscriptionResponse (
  text: String)

object CreateTranscriptionResponse {
  import DateTimeCodecs._

  implicit val CreateTranscriptionResponseCodecJson: CodecJson[CreateTranscriptionResponse] = CodecJson.derive[CreateTranscriptionResponse]
  implicit val CreateTranscriptionResponseDecoder: EntityDecoder[CreateTranscriptionResponse] = jsonOf[CreateTranscriptionResponse]
  implicit val CreateTranscriptionResponseEncoder: EntityEncoder[CreateTranscriptionResponse] = jsonEncoderOf[CreateTranscriptionResponse]
}
