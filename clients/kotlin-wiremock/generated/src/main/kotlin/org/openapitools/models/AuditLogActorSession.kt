@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogActorSession(
    @field:JsonProperty("user")
    val user: AuditLogActorUser? = null,

    @field:JsonProperty("ip_address")
    val ipAddress: kotlin.String? = null,

)
