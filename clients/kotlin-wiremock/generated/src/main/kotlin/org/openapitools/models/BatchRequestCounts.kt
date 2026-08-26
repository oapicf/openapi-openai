@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BatchRequestCounts(
    @field:JsonProperty("total")
    val total: kotlin.Int,

    @field:JsonProperty("completed")
    val completed: kotlin.Int,

    @field:JsonProperty("failed")
    val failed: kotlin.Int,

)
