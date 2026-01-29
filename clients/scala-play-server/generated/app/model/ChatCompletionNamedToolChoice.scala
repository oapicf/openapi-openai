package model

import play.api.libs.json._

/**
  * Specifies a tool the model should use. Use to force the model to call a specific function.
  * @param `type` The type of the tool. Currently, only `function` is supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionNamedToolChoice(
  `type`: ChatCompletionNamedToolChoice.Type.Value,
  function: ChatCompletionNamedToolChoiceFunction
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

