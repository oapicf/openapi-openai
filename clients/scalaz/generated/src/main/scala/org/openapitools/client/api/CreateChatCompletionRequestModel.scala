package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionRequestModel._

case class CreateChatCompletionRequestModel (
  
object CreateChatCompletionRequestModel {
  import DateTimeCodecs._

  implicit val CreateChatCompletionRequestModelCodecJson: CodecJson[CreateChatCompletionRequestModel] = CodecJson.derive[CreateChatCompletionRequestModel]
  implicit val CreateChatCompletionRequestModelDecoder: EntityDecoder[CreateChatCompletionRequestModel] = jsonOf[CreateChatCompletionRequestModel]
  implicit val CreateChatCompletionRequestModelEncoder: EntityEncoder[CreateChatCompletionRequestModel] = jsonEncoderOf[CreateChatCompletionRequestModel]
}
