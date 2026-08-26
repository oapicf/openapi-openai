package model

import play.api.libs.json._

/**
  * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
  * @param completionTokens Number of completion tokens used over the course of the run step.
  * @param promptTokens Number of prompt tokens used over the course of the run step.
  * @param totalTokens Total number of tokens used (prompt + completion).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RunStepCompletionUsage(
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

object RunStepCompletionUsage {
  implicit lazy val runStepCompletionUsageJsonFormat: Format[RunStepCompletionUsage] = Json.format[RunStepCompletionUsage]
}

