package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchRequestCounts(
    /** Total number of requests in the batch. */
    val total: kotlin.Int,
    /** Number of requests that have been completed successfully. */
    val completed: kotlin.Int,
    /** Number of requests that have failed. */
    val failed: kotlin.Int
)
