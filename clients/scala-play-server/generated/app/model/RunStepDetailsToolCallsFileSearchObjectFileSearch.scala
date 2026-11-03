package model

import play.api.libs.json._

/**
  * For now, this is always going to be an empty object.
  * @param results The results of the file search.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDetailsToolCallsFileSearchObjectFileSearch(
  rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
  results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]]
)

object RunStepDetailsToolCallsFileSearchObjectFileSearch {
  implicit lazy val runStepDetailsToolCallsFileSearchObjectFileSearchJsonFormat: Format[RunStepDetailsToolCallsFileSearchObjectFileSearch] = Json.format[RunStepDetailsToolCallsFileSearchObjectFileSearch]
}

