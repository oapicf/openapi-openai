package model

import play.api.libs.json._

/**
  * The role of the author of a message
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ChatCompletionRole(
)

object ChatCompletionRole {
  implicit lazy val chatCompletionRoleJsonFormat: Format[ChatCompletionRole] = Json.format[ChatCompletionRole]
}

