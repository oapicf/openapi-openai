package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateCompletionRequestModel._

case class CreateCompletionRequestModel (
  
object CreateCompletionRequestModel {
  import DateTimeCodecs._

  implicit val CreateCompletionRequestModelCodecJson: CodecJson[CreateCompletionRequestModel] = CodecJson.derive[CreateCompletionRequestModel]
  implicit val CreateCompletionRequestModelDecoder: EntityDecoder[CreateCompletionRequestModel] = jsonOf[CreateCompletionRequestModel]
  implicit val CreateCompletionRequestModelEncoder: EntityEncoder[CreateCompletionRequestModel] = jsonEncoderOf[CreateCompletionRequestModel]
}
