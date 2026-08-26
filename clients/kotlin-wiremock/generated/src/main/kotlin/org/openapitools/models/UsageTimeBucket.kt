@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageTimeBucket(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int,

    @field:JsonProperty("result")
    val result: kotlin.collections.List<UsageTimeBucketResultInner>,

)
