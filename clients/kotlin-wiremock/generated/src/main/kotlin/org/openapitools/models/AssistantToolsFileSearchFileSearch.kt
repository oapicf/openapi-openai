@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssistantToolsFileSearchFileSearch(
    @field:JsonProperty("max_num_results")
    val maxNumResults: kotlin.Int? = null,

    @field:JsonProperty("ranking_options")
    val rankingOptions: FileSearchRankingOptions? = null,

)
