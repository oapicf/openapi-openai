package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogOrganizationUpdatedChangesRequestedSettings
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogOrganizationUpdatedChangesRequested(
    /** The organization title. */
    val title: kotlin.String? = null,
    /** The organization description. */
    val description: kotlin.String? = null,
    /** The organization name. */
    val name: kotlin.String? = null,
    val settings: AuditLogOrganizationUpdatedChangesRequestedSettings? = null
)
