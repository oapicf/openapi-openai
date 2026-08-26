package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogProjectCreatedData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProjectCreated(
    /** The project ID. */
    val id: kotlin.String? = null,
    val `data`: AuditLogProjectCreatedData? = null
)
