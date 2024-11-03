package model

import play.api.libs.json._

/**
  * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
  * @param completionTokens Number of completion tokens used over the course of the run.
  * @param promptTokens Number of prompt tokens used over the course of the run.
  * @param totalTokens Total number of tokens used (prompt + completion).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunCompletionUsage(
  completionTokens: Int,
  promptTokens: Int,
  totalTokens: Int
)

object RunCompletionUsage {
  implicit lazy val runCompletionUsageJsonFormat: Format[RunCompletionUsage] = Json.format[RunCompletionUsage]
}

