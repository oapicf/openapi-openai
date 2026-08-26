package org.openapitools.server.api.model

import org.openapitools.server.api.model.FileSearchRankingOptions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantToolsFileSearchFileSearch(
    /** The maximum number of results the file search tool should output. The default is 20 for &#x60;gpt-4*&#x60; models and 5 for &#x60;gpt-3.5-turbo&#x60;. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than &#x60;max_num_results&#x60; results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information.  */
    val maxNumResults: kotlin.Int? = null,
    val rankingOptions: FileSearchRankingOptions? = null
)
