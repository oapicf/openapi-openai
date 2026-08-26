package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogInviteSentData(
    /** The email invited to the organization. */
    val email: kotlin.String? = null,
    /** The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;. */
    val role: kotlin.String? = null
)
