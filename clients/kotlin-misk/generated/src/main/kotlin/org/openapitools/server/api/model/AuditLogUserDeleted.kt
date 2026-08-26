package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogUserDeleted(
    /** The user ID. */
    val id: kotlin.String? = null
)
