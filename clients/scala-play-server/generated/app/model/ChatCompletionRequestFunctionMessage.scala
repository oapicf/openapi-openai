package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestFunctionMessage.
  * @param role The role of the messages author, in this case `function`.
  * @param content The contents of the function message.
  * @param name The name of the function to call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestFunctionMessage(
  role: ChatCompletionRequestFunctionMessage.Role.Value,
  content: String,
  name: String
)

object ChatCompletionRequestFunctionMessage {
  implicit lazy val chatCompletionRequestFunctionMessageJsonFormat: Format[ChatCompletionRequestFunctionMessage] = Json.format[ChatCompletionRequestFunctionMessage]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Function = Value("function")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

