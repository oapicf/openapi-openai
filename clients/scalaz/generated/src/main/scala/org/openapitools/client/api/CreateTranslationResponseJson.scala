package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateTranslationResponseJson._

case class CreateTranslationResponseJson (
  text: String)

object CreateTranslationResponseJson {
  import DateTimeCodecs._

  implicit val CreateTranslationResponseJsonCodecJson: CodecJson[CreateTranslationResponseJson] = CodecJson.derive[CreateTranslationResponseJson]
  implicit val CreateTranslationResponseJsonDecoder: EntityDecoder[CreateTranslationResponseJson] = jsonOf[CreateTranslationResponseJson]
  implicit val CreateTranslationResponseJsonEncoder: EntityEncoder[CreateTranslationResponseJson] = jsonEncoderOf[CreateTranslationResponseJson]
}
