@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListFineTuningJobEventsResponse(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<FineTuningJobEvent>,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

)
