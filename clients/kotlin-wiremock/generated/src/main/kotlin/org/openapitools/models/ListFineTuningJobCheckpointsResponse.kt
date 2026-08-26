@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListFineTuningJobCheckpointsResponse(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<FineTuningJobCheckpoint>,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("has_more")
    val hasMore: kotlin.Boolean,

    @field:JsonProperty("first_id")
    val firstId: kotlin.String? = null,

    @field:JsonProperty("last_id")
    val lastId: kotlin.String? = null,

)
