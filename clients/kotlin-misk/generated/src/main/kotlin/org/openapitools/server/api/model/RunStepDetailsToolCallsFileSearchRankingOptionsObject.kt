package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFileSearchRankingOptionsObject(
    /** The ranker used for the file search. */
    val ranker: kotlin.String,
    /** The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    val scoreThreshold: java.math.BigDecimal
)
