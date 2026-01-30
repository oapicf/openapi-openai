package model

import play.api.libs.json._

/**
  * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
  * @param completionTokens Number of tokens in the generated completion.
  * @param promptTokens Number of tokens in the prompt.
  * @param totalTokens Total number of tokens used in the request (prompt + completion).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionStreamResponseUsage(
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

object CreateChatCompletionStreamResponseUsage {
  implicit lazy val createChatCompletionStreamResponseUsageJsonFormat: Format[CreateChatCompletionStreamResponseUsage] = Json.format[CreateChatCompletionStreamResponseUsage]
}

