package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionRequestFunctionCallOneOf._

case class CreateChatCompletionRequestFunctionCallOneOf (
  /* The name of the function to call. */
  name: String)

object CreateChatCompletionRequestFunctionCallOneOf {
  import DateTimeCodecs._

  implicit val CreateChatCompletionRequestFunctionCallOneOfCodecJson: CodecJson[CreateChatCompletionRequestFunctionCallOneOf] = CodecJson.derive[CreateChatCompletionRequestFunctionCallOneOf]
  implicit val CreateChatCompletionRequestFunctionCallOneOfDecoder: EntityDecoder[CreateChatCompletionRequestFunctionCallOneOf] = jsonOf[CreateChatCompletionRequestFunctionCallOneOf]
  implicit val CreateChatCompletionRequestFunctionCallOneOfEncoder: EntityEncoder[CreateChatCompletionRequestFunctionCallOneOf] = jsonEncoderOf[CreateChatCompletionRequestFunctionCallOneOf]
}
