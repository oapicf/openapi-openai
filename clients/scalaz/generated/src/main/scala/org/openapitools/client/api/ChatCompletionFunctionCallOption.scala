package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionFunctionCallOption._

case class ChatCompletionFunctionCallOption (
  /* The name of the function to call. */
  name: String)

object ChatCompletionFunctionCallOption {
  import DateTimeCodecs._

  implicit val ChatCompletionFunctionCallOptionCodecJson: CodecJson[ChatCompletionFunctionCallOption] = CodecJson.derive[ChatCompletionFunctionCallOption]
  implicit val ChatCompletionFunctionCallOptionDecoder: EntityDecoder[ChatCompletionFunctionCallOption] = jsonOf[ChatCompletionFunctionCallOption]
  implicit val ChatCompletionFunctionCallOptionEncoder: EntityEncoder[ChatCompletionFunctionCallOption] = jsonEncoderOf[ChatCompletionFunctionCallOption]
}
