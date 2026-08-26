package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogUserAddedData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogUserAdded(
    /** The user ID. */
    val id: kotlin.String? = null,
    val `data`: AuditLogUserAddedData? = null
)
