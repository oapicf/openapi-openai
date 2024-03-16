package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationRequest._

case class CreateModerationRequest (
  input: CreateModerationRequestInput,
model: Option[CreateModerationRequestModel])

object CreateModerationRequest {
  import DateTimeCodecs._

  implicit val CreateModerationRequestCodecJson: CodecJson[CreateModerationRequest] = CodecJson.derive[CreateModerationRequest]
  implicit val CreateModerationRequestDecoder: EntityDecoder[CreateModerationRequest] = jsonOf[CreateModerationRequest]
  implicit val CreateModerationRequestEncoder: EntityEncoder[CreateModerationRequest] = jsonEncoderOf[CreateModerationRequest]
}
