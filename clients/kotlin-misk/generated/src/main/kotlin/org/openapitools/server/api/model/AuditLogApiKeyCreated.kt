package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogApiKeyCreatedData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogApiKeyCreated(
    /** The tracking ID of the API key. */
    val id: kotlin.String? = null,
    val `data`: AuditLogApiKeyCreatedData? = null
)
