@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageResponse(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<UsageTimeBucket>,

    @field:JsonProperty("has_more")
    val hasMore: kotlin.Boolean,

    @field:JsonProperty("next_page")
    val nextPage: kotlin.String,

)
