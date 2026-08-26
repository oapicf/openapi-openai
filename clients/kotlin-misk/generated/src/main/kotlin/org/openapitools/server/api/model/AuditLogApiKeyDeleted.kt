package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogApiKeyDeleted(
    /** The tracking ID of the API key. */
    val id: kotlin.String? = null
)
