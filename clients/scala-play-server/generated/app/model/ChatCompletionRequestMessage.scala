package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessage.
  * @param role The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
  * @param content The contents of the message. `content` is required for all messages except assistant messages with function calls.
  * @param name The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestMessage(
  role: ChatCompletionRequestMessage.Role.Value,
  content: Option[String],
  name: Option[String],
  functionCall: Option[ChatCompletionRequestMessageFunctionCall]
)

object ChatCompletionRequestMessage {
  implicit lazy val chatCompletionRequestMessageJsonFormat: Format[ChatCompletionRequestMessage] = Json.format[ChatCompletionRequestMessage]

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

