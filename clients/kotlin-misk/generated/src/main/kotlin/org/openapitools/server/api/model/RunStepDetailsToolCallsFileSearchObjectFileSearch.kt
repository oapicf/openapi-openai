package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchRankingOptionsObject
import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchResultObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFileSearchObjectFileSearch(
    val rankingOptions: RunStepDetailsToolCallsFileSearchRankingOptionsObject? = null,
    /** The results of the file search. */
    val results: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObject>? = null
)
