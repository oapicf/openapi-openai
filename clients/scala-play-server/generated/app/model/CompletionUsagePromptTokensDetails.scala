package model

import play.api.libs.json._

/**
  * Breakdown of tokens used in the prompt.
  * @param audioTokens Audio input tokens present in the prompt.
  * @param cachedTokens Cached tokens present in the prompt.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CompletionUsagePromptTokensDetails(
  audioTokens: Option[Int],
  cachedTokens: Option[Int]
)

object CompletionUsagePromptTokensDetails {
  implicit lazy val completionUsagePromptTokensDetailsJsonFormat: Format[CompletionUsagePromptTokensDetails] = Json.format[CompletionUsagePromptTokensDetails]
}

