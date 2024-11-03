package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionMessageToolCall.
  * @param id The ID of the tool call.
  * @param `type` The type of the tool. Currently, only `function` is supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ChatCompletionMessageToolCall(
  id: String,
  `type`: ChatCompletionMessageToolCall.Type.Value,
  function: ChatCompletionMessageToolCallFunction
)

object ChatCompletionMessageToolCall {
  implicit lazy val chatCompletionMessageToolCallJsonFormat: Format[ChatCompletionMessageToolCall] = Json.format[ChatCompletionMessageToolCall]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

