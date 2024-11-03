package model

import play.api.libs.json._

/**
  * The contents of the user message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ChatCompletionRequestUserMessageContent(
)

object ChatCompletionRequestUserMessageContent {
  implicit lazy val chatCompletionRequestUserMessageContentJsonFormat: Format[ChatCompletionRequestUserMessageContent] = Json.format[ChatCompletionRequestUserMessageContent]
}

