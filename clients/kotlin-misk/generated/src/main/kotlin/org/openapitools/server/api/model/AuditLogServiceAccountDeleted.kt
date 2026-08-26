package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogServiceAccountDeleted(
    /** The service account ID. */
    val id: kotlin.String? = null
)
