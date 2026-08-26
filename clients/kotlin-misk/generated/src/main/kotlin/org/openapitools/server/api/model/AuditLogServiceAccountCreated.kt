package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogServiceAccountCreatedData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogServiceAccountCreated(
    /** The service account ID. */
    val id: kotlin.String? = null,
    val `data`: AuditLogServiceAccountCreatedData? = null
)
