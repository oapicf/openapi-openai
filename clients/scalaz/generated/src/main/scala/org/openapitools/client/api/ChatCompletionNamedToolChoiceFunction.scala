package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionNamedToolChoiceFunction._

case class ChatCompletionNamedToolChoiceFunction (
  /* The name of the function to call. */
  name: String)

object ChatCompletionNamedToolChoiceFunction {
  import DateTimeCodecs._

  implicit val ChatCompletionNamedToolChoiceFunctionCodecJson: CodecJson[ChatCompletionNamedToolChoiceFunction] = CodecJson.derive[ChatCompletionNamedToolChoiceFunction]
  implicit val ChatCompletionNamedToolChoiceFunctionDecoder: EntityDecoder[ChatCompletionNamedToolChoiceFunction] = jsonOf[ChatCompletionNamedToolChoiceFunction]
  implicit val ChatCompletionNamedToolChoiceFunctionEncoder: EntityEncoder[ChatCompletionNamedToolChoiceFunction] = jsonEncoderOf[ChatCompletionNamedToolChoiceFunction]
}
