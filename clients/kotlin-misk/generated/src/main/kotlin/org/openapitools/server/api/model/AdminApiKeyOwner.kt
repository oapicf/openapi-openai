package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdminApiKeyOwner(
    val type: kotlin.String? = null,
    val id: kotlin.String? = null,
    val name: kotlin.String? = null,
    val createdAt: kotlin.Long? = null,
    val role: kotlin.String? = null
)
