package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteFileResponse._

case class DeleteFileResponse (
  id: String,
`object`: String,
deleted: Boolean)

object DeleteFileResponse {
  import DateTimeCodecs._

  implicit val DeleteFileResponseCodecJson: CodecJson[DeleteFileResponse] = CodecJson.derive[DeleteFileResponse]
  implicit val DeleteFileResponseDecoder: EntityDecoder[DeleteFileResponse] = jsonOf[DeleteFileResponse]
  implicit val DeleteFileResponseEncoder: EntityEncoder[DeleteFileResponse] = jsonEncoderOf[DeleteFileResponse]
}
