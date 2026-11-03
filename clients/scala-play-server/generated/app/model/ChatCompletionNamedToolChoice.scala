package model

import play.api.libs.json._

/**
  * Specifies a tool the model should use. Use to force the model to call a specific function.
  * @param `type` The type of the tool. Currently, only `function` is supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionNamedToolChoice(
  `type`: ChatCompletionNamedToolChoice.Type.Value,
  function: AssistantsNamedToolChoiceFunction
)

object ChatCompletionNamedToolChoice {
  implicit lazy val chatCompletionNamedToolChoiceJsonFormat: Format[ChatCompletionNamedToolChoice] = Json.format[ChatCompletionNamedToolChoice]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

