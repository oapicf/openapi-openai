package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionMessageToolCallChunk.
  * @param id The ID of the tool call.
  * @param `type` The type of the tool. Currently, only `function` is supported.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionMessageToolCallChunk(
  index: Int,
  id: Option[String],
  `type`: Option[ChatCompletionMessageToolCallChunk.Type.Value],
  function: Option[ChatCompletionMessageToolCallChunkFunction]
)

object ChatCompletionMessageToolCallChunk {
  implicit lazy val chatCompletionMessageToolCallChunkJsonFormat: Format[ChatCompletionMessageToolCallChunk] = Json.format[ChatCompletionMessageToolCallChunk]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

