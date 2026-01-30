package model

import play.api.libs.json._

/**
  * The role of the author of a message
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionRole(
)

object ChatCompletionRole {
  implicit lazy val chatCompletionRoleJsonFormat: Format[ChatCompletionRole] = Json.format[ChatCompletionRole]
}

