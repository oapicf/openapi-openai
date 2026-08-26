@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListPaginatedFineTuningJobsResponse(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<FineTuningJob>,

    @field:JsonProperty("has_more")
    val hasMore: kotlin.Boolean,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

)
