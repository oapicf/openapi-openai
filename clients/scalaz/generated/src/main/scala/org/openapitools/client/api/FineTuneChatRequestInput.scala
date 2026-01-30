package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneChatRequestInput._

case class FineTuneChatRequestInput (
  messages: Option[List[FineTuneChatRequestInputMessagesInner]],
/* A list of tools the model may generate JSON inputs for. */
  tools: Option[List[ChatCompletionTool]],
/* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
  parallelToolCalls: Option[Boolean],
/* A list of functions the model may generate JSON inputs for. */
  functions: Option[List[ChatCompletionFunctions]])

object FineTuneChatRequestInput {
  import DateTimeCodecs._

  implicit val FineTuneChatRequestInputCodecJson: CodecJson[FineTuneChatRequestInput] = CodecJson.derive[FineTuneChatRequestInput]
  implicit val FineTuneChatRequestInputDecoder: EntityDecoder[FineTuneChatRequestInput] = jsonOf[FineTuneChatRequestInput]
  implicit val FineTuneChatRequestInputEncoder: EntityEncoder[FineTuneChatRequestInput] = jsonEncoderOf[FineTuneChatRequestInput]
}
