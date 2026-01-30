package model

import play.api.libs.json._

/**
  * Overrides for the file search tool.
  * @param maxNumResults The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantToolsFileSearchFileSearch(
  maxNumResults: Option[Int],
  rankingOptions: Option[FileSearchRankingOptions]
)

object AssistantToolsFileSearchFileSearch {
  implicit lazy val assistantToolsFileSearchFileSearchJsonFormat: Format[AssistantToolsFileSearchFileSearch] = Json.format[AssistantToolsFileSearchFileSearch]
}

