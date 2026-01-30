package model

import play.api.libs.json._

/**
  * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
  * @param role The role of the messages author, in this case `developer`.
  * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionRequestDeveloperMessage(
  content: ChatCompletionRequestDeveloperMessageContent,
  role: ChatCompletionRequestDeveloperMessage.Role.Value,
  name: Option[String]
)

object ChatCompletionRequestDeveloperMessage {
  implicit lazy val chatCompletionRequestDeveloperMessageJsonFormat: Format[ChatCompletionRequestDeveloperMessage] = Json.format[ChatCompletionRequestDeveloperMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Developer = Value("developer")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

