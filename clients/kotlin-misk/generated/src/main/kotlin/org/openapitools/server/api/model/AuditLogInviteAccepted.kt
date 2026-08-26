package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogInviteAccepted(
    /** The ID of the invite. */
    val id: kotlin.String? = null
)
