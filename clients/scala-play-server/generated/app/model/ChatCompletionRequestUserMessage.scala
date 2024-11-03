package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestUserMessage.
  * @param role The role of the messages author, in this case `user`.
  * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

