package model

import play.api.libs.json._

/**
  * The contents of the user message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestUserMessageContent(
)

object ChatCompletionRequestUserMessageContent {
  implicit lazy val chatCompletionRequestUserMessageContentJsonFormat: Format[ChatCompletionRequestUserMessageContent] = Json.format[ChatCompletionRequestUserMessageContent]
}

