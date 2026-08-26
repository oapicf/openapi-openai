package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogRateLimitUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogRateLimitUpdated(
    /** The rate limit ID */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogRateLimitUpdatedChangesRequested? = null
)
