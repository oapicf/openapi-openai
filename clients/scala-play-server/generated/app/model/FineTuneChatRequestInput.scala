package model

import play.api.libs.json._

/**
  * The per-line training example of a fine-tuning input file for chat models using the supervised method.
  * @param tools A list of tools the model may generate JSON inputs for.
  * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  * @param functions A list of functions the model may generate JSON inputs for.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTuneChatRequestInput(
  messages: Option[List[FineTuneChatRequestInputMessagesInner]],
  tools: Option[List[ChatCompletionTool]],
  parallelToolCalls: Option[Boolean],
  functions: Option[List[ChatCompletionFunctions]]
)

object FineTuneChatRequestInput {
  implicit lazy val fineTuneChatRequestInputJsonFormat: Format[FineTuneChatRequestInput] = Json.format[FineTuneChatRequestInput]
}

