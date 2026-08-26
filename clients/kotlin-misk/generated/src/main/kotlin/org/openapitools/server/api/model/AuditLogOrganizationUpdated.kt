package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogOrganizationUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogOrganizationUpdated(
    /** The organization ID. */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogOrganizationUpdatedChangesRequested? = null
)
