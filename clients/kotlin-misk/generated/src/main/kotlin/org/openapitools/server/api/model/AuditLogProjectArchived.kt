package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProjectArchived(
    /** The project ID. */
    val id: kotlin.String? = null
)
