package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteModelResponse._

case class DeleteModelResponse (
  id: String,
`object`: String,
deleted: Boolean)

object DeleteModelResponse {
  import DateTimeCodecs._

  implicit val DeleteModelResponseCodecJson: CodecJson[DeleteModelResponse] = CodecJson.derive[DeleteModelResponse]
  implicit val DeleteModelResponseDecoder: EntityDecoder[DeleteModelResponse] = jsonOf[DeleteModelResponse]
  implicit val DeleteModelResponseEncoder: EntityEncoder[DeleteModelResponse] = jsonEncoderOf[DeleteModelResponse]
}
