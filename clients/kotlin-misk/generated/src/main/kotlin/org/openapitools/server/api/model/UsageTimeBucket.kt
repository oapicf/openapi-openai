package org.openapitools.server.api.model

import org.openapitools.server.api.model.UsageTimeBucketResultInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageTimeBucket(
    val `object`: kotlin.String,
    val startTime: kotlin.Int,
    val endTime: kotlin.Int,
    val result: kotlin.collections.List<UsageTimeBucketResultInner>
)
