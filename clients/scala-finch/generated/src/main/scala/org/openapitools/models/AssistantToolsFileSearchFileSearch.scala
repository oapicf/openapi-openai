package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FileSearchRankingOptions

/**
 * Overrides for the file search tool.
 * @param maxUnderscorenumUnderscoreresults The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * @param rankingUnderscoreoptions 
 */
case class AssistantToolsFileSearchFileSearch(maxUnderscorenumUnderscoreresults: Option[Int],
                rankingUnderscoreoptions: Option[FileSearchRankingOptions]
                )

object AssistantToolsFileSearchFileSearch {
    /**
     * Creates the codec for converting AssistantToolsFileSearchFileSearch from and to JSON.
     */
    implicit val decoder: Decoder[AssistantToolsFileSearchFileSearch] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantToolsFileSearchFileSearch] = deriveEncoder
}
