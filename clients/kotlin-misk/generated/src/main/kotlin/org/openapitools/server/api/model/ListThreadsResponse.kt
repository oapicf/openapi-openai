package org.openapitools.server.api.model

import org.openapitools.server.api.model.ThreadObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListThreadsResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<ThreadObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
