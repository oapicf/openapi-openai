package org.openapitools.server.api.model

import org.openapitools.server.api.model.VectorStoreFileObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListVectorStoreFilesResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<VectorStoreFileObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
)
