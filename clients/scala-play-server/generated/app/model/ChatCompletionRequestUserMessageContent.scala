package model

import play.api.libs.json._

/**
  * The contents of the user message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestUserMessageContent(
)

object ChatCompletionRequestUserMessageContent {
  implicit lazy val chatCompletionRequestUserMessageContentJsonFormat: Format[ChatCompletionRequestUserMessageContent] = Json.format[ChatCompletionRequestUserMessageContent]
}

