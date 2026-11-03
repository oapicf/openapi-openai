package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FineTunePreferenceRequestInput_input.
  * @param tools A list of tools the model may generate JSON inputs for.
  * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTunePreferenceRequestInputInput(
  messages: Option[List[FineTuneChatRequestInputMessagesInner]],
  tools: Option[List[ChatCompletionTool]],
  parallelToolCalls: Option[Boolean]
)

object FineTunePreferenceRequestInputInput {
  implicit lazy val fineTunePreferenceRequestInputInputJsonFormat: Format[FineTunePreferenceRequestInputInput] = Json.format[FineTunePreferenceRequestInputInput]
}

