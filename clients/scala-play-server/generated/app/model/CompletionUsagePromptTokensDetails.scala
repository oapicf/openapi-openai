package model

import play.api.libs.json._

/**
  * Breakdown of tokens used in the prompt.
  * @param audioTokens Audio input tokens present in the prompt.
  * @param cachedTokens Cached tokens present in the prompt.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CompletionUsagePromptTokensDetails(
  audioTokens: Option[Int],
  cachedTokens: Option[Int]
)

object CompletionUsagePromptTokensDetails {
  implicit lazy val completionUsagePromptTokensDetailsJsonFormat: Format[CompletionUsagePromptTokensDetails] = Json.format[CompletionUsagePromptTokensDetails]
}

