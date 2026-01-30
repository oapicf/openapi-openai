package model

import play.api.libs.json._

/**
  * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
  * @param role The role of the messages author, in this case `system`.
  * @param name An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionRequestSystemMessage(
  content: ChatCompletionRequestSystemMessageContent,
  role: ChatCompletionRequestSystemMessage.Role.Value,
  name: Option[String]
)

object ChatCompletionRequestSystemMessage {
  implicit lazy val chatCompletionRequestSystemMessageJsonFormat: Format[ChatCompletionRequestSystemMessage] = Json.format[ChatCompletionRequestSystemMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val System = Value("system")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

