package model

import play.api.libs.json._

/**
  * The contents of the tool message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ChatCompletionRequestToolMessageContent(
)

object ChatCompletionRequestToolMessageContent {
  implicit lazy val chatCompletionRequestToolMessageContentJsonFormat: Format[ChatCompletionRequestToolMessageContent] = Json.format[ChatCompletionRequestToolMessageContent]
}

