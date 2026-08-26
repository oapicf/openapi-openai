package org.openapitools.server.api.model

import org.openapitools.server.api.model.Batch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListBatchesResponse(
    val `data`: kotlin.collections.List<Batch>,
    val hasMore: kotlin.Boolean,
    val `object`: kotlin.String,
    val firstId: kotlin.String? = null,
    val lastId: kotlin.String? = null
)
