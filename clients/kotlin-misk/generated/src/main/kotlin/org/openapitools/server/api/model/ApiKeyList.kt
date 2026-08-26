package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdminApiKey
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiKeyList(
    val `object`: kotlin.String? = null,
    val `data`: kotlin.collections.List<AdminApiKey>? = null,
    val hasMore: kotlin.Boolean? = null,
    val firstId: kotlin.String? = null,
    val lastId: kotlin.String? = null
)
