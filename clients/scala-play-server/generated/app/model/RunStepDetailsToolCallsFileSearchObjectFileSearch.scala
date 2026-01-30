package model

import play.api.libs.json._

/**
  * For now, this is always going to be an empty object.
  * @param results The results of the file search.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsFileSearchObjectFileSearch(
  rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
  results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]]
)

object RunStepDetailsToolCallsFileSearchObjectFileSearch {
  implicit lazy val runStepDetailsToolCallsFileSearchObjectFileSearchJsonFormat: Format[RunStepDetailsToolCallsFileSearchObjectFileSearch] = Json.format[RunStepDetailsToolCallsFileSearchObjectFileSearch]
}

