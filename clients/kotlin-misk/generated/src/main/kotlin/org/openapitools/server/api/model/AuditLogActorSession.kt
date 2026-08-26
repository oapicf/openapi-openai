package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogActorUser
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogActorSession(
    val user: AuditLogActorUser? = null,
    /** The IP address from which the action was performed. */
    val ipAddress: kotlin.String? = null
)
