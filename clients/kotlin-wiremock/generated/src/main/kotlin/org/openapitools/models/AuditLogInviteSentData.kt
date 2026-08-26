@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogInviteSentData(
    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("role")
    val role: kotlin.String? = null,

)
