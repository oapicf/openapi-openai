package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DefaultProjectErrorResponse._

case class DefaultProjectErrorResponse (
  code: Integer,
message: String)

object DefaultProjectErrorResponse {
  import DateTimeCodecs._

  implicit val DefaultProjectErrorResponseCodecJson: CodecJson[DefaultProjectErrorResponse] = CodecJson.derive[DefaultProjectErrorResponse]
  implicit val DefaultProjectErrorResponseDecoder: EntityDecoder[DefaultProjectErrorResponse] = jsonOf[DefaultProjectErrorResponse]
  implicit val DefaultProjectErrorResponseEncoder: EntityEncoder[DefaultProjectErrorResponse] = jsonEncoderOf[DefaultProjectErrorResponse]
}
