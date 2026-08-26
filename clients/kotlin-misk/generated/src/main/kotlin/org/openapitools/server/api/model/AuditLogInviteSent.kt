package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuditLogInviteSentData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogInviteSent(
    /** The ID of the invite. */
    val id: kotlin.String? = null,
    val `data`: AuditLogInviteSentData? = null
)
