package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogUserUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogUserUpdated(
    /** The project ID. */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogUserUpdatedChangesRequested? = null
)
