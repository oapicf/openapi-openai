package model

import play.api.libs.json._

/**
  * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionRequestAssistantMessageContent(
)

object ChatCompletionRequestAssistantMessageContent {
  implicit lazy val chatCompletionRequestAssistantMessageContentJsonFormat: Format[ChatCompletionRequestAssistantMessageContent] = Json.format[ChatCompletionRequestAssistantMessageContent]
}

