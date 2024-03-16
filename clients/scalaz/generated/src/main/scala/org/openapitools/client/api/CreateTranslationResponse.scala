package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranslationResponse._

case class CreateTranslationResponse (
  text: String)

object CreateTranslationResponse {
  import DateTimeCodecs._

  implicit val CreateTranslationResponseCodecJson: CodecJson[CreateTranslationResponse] = CodecJson.derive[CreateTranslationResponse]
  implicit val CreateTranslationResponseDecoder: EntityDecoder[CreateTranslationResponse] = jsonOf[CreateTranslationResponse]
  implicit val CreateTranslationResponseEncoder: EntityEncoder[CreateTranslationResponse] = jsonEncoderOf[CreateTranslationResponse]
}
