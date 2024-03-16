package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionFunctions._

case class ChatCompletionFunctions (
  /* The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
  name: String,
/* The description of what the function does. */
  description: Option[String],
/* The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. */
  parameters: Option[Map[String, AnyType]])

object ChatCompletionFunctions {
  import DateTimeCodecs._

  implicit val ChatCompletionFunctionsCodecJson: CodecJson[ChatCompletionFunctions] = CodecJson.derive[ChatCompletionFunctions]
  implicit val ChatCompletionFunctionsDecoder: EntityDecoder[ChatCompletionFunctions] = jsonOf[ChatCompletionFunctions]
  implicit val ChatCompletionFunctionsEncoder: EntityEncoder[ChatCompletionFunctions] = jsonEncoderOf[ChatCompletionFunctions]
}
