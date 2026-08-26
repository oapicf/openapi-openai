package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogRateLimitDeleted(
    /** The rate limit ID */
    val id: kotlin.String? = null
)
