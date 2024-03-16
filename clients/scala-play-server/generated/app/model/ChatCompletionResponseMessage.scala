package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionResponseMessage.
  * @param role The role of the author of this message.
  * @param content The contents of the message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionResponseMessage(
  role: ChatCompletionResponseMessage.Role.Value,
  content: Option[String],
  functionCall: Option[ChatCompletionRequestMessageFunctionCall]
)

object ChatCompletionResponseMessage {
  implicit lazy val chatCompletionResponseMessageJsonFormat: Format[ChatCompletionResponseMessage] = Json.format[ChatCompletionResponseMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val System = Value("system")
    val User = Value("user")
    val Assistant = Value("assistant")
    val Function = Value("function")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

