@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDetailsToolCallsFileSearchRankingOptionsObject(
    @field:JsonProperty("ranker")
    val ranker: kotlin.String,

    @field:JsonProperty("score_threshold")
    val scoreThreshold: java.math.BigDecimal,

)
