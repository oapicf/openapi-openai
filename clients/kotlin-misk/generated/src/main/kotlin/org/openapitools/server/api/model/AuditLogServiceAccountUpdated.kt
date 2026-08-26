package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogServiceAccountUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogServiceAccountUpdated(
    /** The service account ID. */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogServiceAccountUpdatedChangesRequested? = null
)
