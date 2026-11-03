package model

import play.api.libs.json._

/**
  * The contents of the system message.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestSystemMessageContent(
)

object ChatCompletionRequestSystemMessageContent {
  implicit lazy val chatCompletionRequestSystemMessageContentJsonFormat: Format[ChatCompletionRequestSystemMessageContent] = Json.format[ChatCompletionRequestSystemMessageContent]
}

