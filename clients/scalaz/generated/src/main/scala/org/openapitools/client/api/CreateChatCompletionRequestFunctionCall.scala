package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionRequestFunctionCall._

case class CreateChatCompletionRequestFunctionCall (
  /* The name of the function to call. */
  name: String)

object CreateChatCompletionRequestFunctionCall {
  import DateTimeCodecs._

  implicit val CreateChatCompletionRequestFunctionCallCodecJson: CodecJson[CreateChatCompletionRequestFunctionCall] = CodecJson.derive[CreateChatCompletionRequestFunctionCall]
  implicit val CreateChatCompletionRequestFunctionCallDecoder: EntityDecoder[CreateChatCompletionRequestFunctionCall] = jsonOf[CreateChatCompletionRequestFunctionCall]
  implicit val CreateChatCompletionRequestFunctionCallEncoder: EntityEncoder[CreateChatCompletionRequestFunctionCall] = jsonEncoderOf[CreateChatCompletionRequestFunctionCall]
}
