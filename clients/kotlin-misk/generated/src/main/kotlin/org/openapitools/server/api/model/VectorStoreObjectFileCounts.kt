package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreObjectFileCounts(
    /** The number of files that are currently being processed. */
    val inProgress: kotlin.Int,
    /** The number of files that have been successfully processed. */
    val completed: kotlin.Int,
    /** The number of files that have failed to process. */
    val failed: kotlin.Int,
    /** The number of files that were cancelled. */
    val cancelled: kotlin.Int,
    /** The total number of files. */
    val total: kotlin.Int
)
