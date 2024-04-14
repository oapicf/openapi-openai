package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionTool.
  * @param `type` The type of the tool. Currently, only `function` is supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionTool(
  `type`: ChatCompletionTool.Type.Value,
  function: FunctionObject
)

object ChatCompletionTool {
  implicit lazy val chatCompletionToolJsonFormat: Format[ChatCompletionTool] = Json.format[ChatCompletionTool]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

