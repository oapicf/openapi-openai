package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ErrorResponse._

case class ErrorResponse (
  error: Error)

object ErrorResponse {
  import DateTimeCodecs._

  implicit val ErrorResponseCodecJson: CodecJson[ErrorResponse] = CodecJson.derive[ErrorResponse]
  implicit val ErrorResponseDecoder: EntityDecoder[ErrorResponse] = jsonOf[ErrorResponse]
  implicit val ErrorResponseEncoder: EntityEncoder[ErrorResponse] = jsonEncoderOf[ErrorResponse]
}
