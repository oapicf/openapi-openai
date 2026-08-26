package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VectorStoreFileBatchObjectFileCounts(
    /** The number of files that are currently being processed. */
    val inProgress: kotlin.Int,
    /** The number of files that have been processed. */
    val completed: kotlin.Int,
    /** The number of files that have failed to process. */
    val failed: kotlin.Int,
    /** The number of files that where cancelled. */
    val cancelled: kotlin.Int,
    /** The total number of files. */
    val total: kotlin.Int
)
