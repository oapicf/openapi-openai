package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogProjectUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProjectUpdated(
    /** The project ID. */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogProjectUpdatedChangesRequested? = null
)
