@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FileSearchRankingOptions(
    @field:JsonProperty("score_threshold")
    val scoreThreshold: java.math.BigDecimal,

    @field:JsonProperty("ranker")
    val ranker: kotlin.String? = null,

)
