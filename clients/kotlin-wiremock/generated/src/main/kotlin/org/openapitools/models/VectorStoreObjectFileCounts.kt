@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VectorStoreObjectFileCounts(
    @field:JsonProperty("in_progress")
    val inProgress: kotlin.Int,

    @field:JsonProperty("completed")
    val completed: kotlin.Int,

    @field:JsonProperty("failed")
    val failed: kotlin.Int,

    @field:JsonProperty("cancelled")
    val cancelled: kotlin.Int,

    @field:JsonProperty("total")
    val total: kotlin.Int,

)
