package model

import play.api.libs.json._

/**
  * Usage statistics for the completion request.
  * @param completionTokens Number of tokens in the generated completion.
  * @param promptTokens Number of tokens in the prompt.
  * @param totalTokens Total number of tokens used in the request (prompt + completion).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CompletionUsage(
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int,
  completionTokensDetails: Option[CompletionUsageCompletionTokensDetails],
  promptTokensDetails: Option[CompletionUsagePromptTokensDetails]
)

object CompletionUsage {
  implicit lazy val completionUsageJsonFormat: Format[CompletionUsage] = Json.format[CompletionUsage]
}

