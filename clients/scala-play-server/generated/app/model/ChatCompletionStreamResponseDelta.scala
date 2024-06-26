package model

import play.api.libs.json._

/**
  * A chat completion delta generated by streamed model responses.
  * @param content The contents of the chunk message.
  * @param role The role of the author of this message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionStreamResponseDelta(
  content: Option[String],
  functionCall: Option[ChatCompletionStreamResponseDeltaFunctionCall],
  toolCalls: Option[List[ChatCompletionMessageToolCallChunk]],
  role: Option[ChatCompletionStreamResponseDelta.Role.Value]
)

object ChatCompletionStreamResponseDelta {
  implicit lazy val chatCompletionStreamResponseDeltaJsonFormat: Format[ChatCompletionStreamResponseDelta] = Json.format[ChatCompletionStreamResponseDelta]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val System = Value("system")
    val User = Value("user")
    val Assistant = Value("assistant")
    val Tool = Value("tool")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

