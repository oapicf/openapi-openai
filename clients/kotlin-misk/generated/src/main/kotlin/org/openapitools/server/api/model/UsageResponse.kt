package org.openapitools.server.api.model

import org.openapitools.server.api.model.UsageTimeBucket
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<UsageTimeBucket>,
    val hasMore: kotlin.Boolean,
    val nextPage: kotlin.String
)
