package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdminApiKeyOwner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdminApiKey(
    val `object`: kotlin.String? = null,
    val id: kotlin.String? = null,
    val name: kotlin.String? = null,
    val redactedValue: kotlin.String? = null,
    val `value`: kotlin.String? = null,
    val createdAt: kotlin.Long? = null,
    val owner: AdminApiKeyOwner? = null
)
