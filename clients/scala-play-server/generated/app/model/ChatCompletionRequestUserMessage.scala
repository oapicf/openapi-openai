package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestUserMessage.
  * @param role The role of the messages author, in this case `user`.
  * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestUserMessage(
  content: ChatCompletionRequestUserMessageContent,
  role: ChatCompletionRequestUserMessage.Role.Value,
  name: Option[String]
)

object ChatCompletionRequestUserMessage {
  implicit lazy val chatCompletionRequestUserMessageJsonFormat: Format[ChatCompletionRequestUserMessage] = Json.format[ChatCompletionRequestUserMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val User = Value("user")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

