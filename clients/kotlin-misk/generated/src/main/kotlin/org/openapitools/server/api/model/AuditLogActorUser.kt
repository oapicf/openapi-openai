package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogActorUser(
    /** The user id. */
    val id: kotlin.String? = null,
    /** The user email. */
    val email: kotlin.String? = null
)
