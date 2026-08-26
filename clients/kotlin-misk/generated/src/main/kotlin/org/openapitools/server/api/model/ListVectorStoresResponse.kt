package org.openapitools.server.api.model

import org.openapitools.server.api.model.VectorStoreObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListVectorStoresResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<VectorStoreObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
