package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestToolMessage.
  * @param role The role of the messages author, in this case `tool`.
  * @param content The contents of the tool message.
  * @param toolCallId Tool call that this message is responding to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestToolMessage(
  role: ChatCompletionRequestToolMessage.Role.Value,
  content: String,
  toolCallId: String
)

object ChatCompletionRequestToolMessage {
  implicit lazy val chatCompletionRequestToolMessageJsonFormat: Format[ChatCompletionRequestToolMessage] = Json.format[ChatCompletionRequestToolMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Tool = Value("tool")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

