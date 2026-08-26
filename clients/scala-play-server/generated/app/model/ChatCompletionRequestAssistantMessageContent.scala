package model

import play.api.libs.json._

/**
  * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ChatCompletionRequestAssistantMessageContent(
)

object ChatCompletionRequestAssistantMessageContent {
  implicit lazy val chatCompletionRequestAssistantMessageContentJsonFormat: Format[ChatCompletionRequestAssistantMessageContent] = Json.format[ChatCompletionRequestAssistantMessageContent]
}

