package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListRunsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<RunObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
