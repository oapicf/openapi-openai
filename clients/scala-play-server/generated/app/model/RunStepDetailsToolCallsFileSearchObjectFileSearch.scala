package model

import play.api.libs.json._

/**
  * For now, this is always going to be an empty object.
  * @param results The results of the file search.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RunStepDetailsToolCallsFileSearchObjectFileSearch(
  rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
  results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]]
)

object RunStepDetailsToolCallsFileSearchObjectFileSearch {
  implicit lazy val runStepDetailsToolCallsFileSearchObjectFileSearchJsonFormat: Format[RunStepDetailsToolCallsFileSearchObjectFileSearch] = Json.format[RunStepDetailsToolCallsFileSearchObjectFileSearch]
}

