package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogApiKeyUpdatedChangesRequested
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogApiKeyUpdated(
    /** The tracking ID of the API key. */
    val id: kotlin.String? = null,
    val changesRequested: AuditLogApiKeyUpdatedChangesRequested? = null
)
