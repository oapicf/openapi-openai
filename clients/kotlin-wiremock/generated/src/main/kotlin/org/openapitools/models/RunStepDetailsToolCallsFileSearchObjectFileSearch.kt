@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsFileSearchObjectFileSearch(
    @field:JsonProperty("ranking_options")
    val rankingOptions: RunStepDetailsToolCallsFileSearchRankingOptionsObject? = null,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<RunStepDetailsToolCallsFileSearchResultObject>? = null,

)
