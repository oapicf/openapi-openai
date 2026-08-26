package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FileSearchRankingOptions(
    /** The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    val scoreThreshold: java.math.BigDecimal,
    /** The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker. */
    val ranker: kotlin.String? = null
)
