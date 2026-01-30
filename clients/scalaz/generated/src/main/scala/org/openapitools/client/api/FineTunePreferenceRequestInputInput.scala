package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTunePreferenceRequestInputInput._

case class FineTunePreferenceRequestInputInput (
  messages: Option[List[FineTuneChatRequestInputMessagesInner]],
/* A list of tools the model may generate JSON inputs for. */
  tools: Option[List[ChatCompletionTool]],
/* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
  parallelToolCalls: Option[Boolean])

object FineTunePreferenceRequestInputInput {
  import DateTimeCodecs._

  implicit val FineTunePreferenceRequestInputInputCodecJson: CodecJson[FineTunePreferenceRequestInputInput] = CodecJson.derive[FineTunePreferenceRequestInputInput]
  implicit val FineTunePreferenceRequestInputInputDecoder: EntityDecoder[FineTunePreferenceRequestInputInput] = jsonOf[FineTunePreferenceRequestInputInput]
  implicit val FineTunePreferenceRequestInputInputEncoder: EntityEncoder[FineTunePreferenceRequestInputInput] = jsonEncoderOf[FineTunePreferenceRequestInputInput]
}
