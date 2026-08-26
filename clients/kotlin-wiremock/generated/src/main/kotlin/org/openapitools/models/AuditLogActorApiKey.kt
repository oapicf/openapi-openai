@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogActorApiKey(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("user")
    val user: AuditLogActorUser? = null,

    @field:JsonProperty("service_account")
    val serviceAccount: AuditLogActorServiceAccount? = null,

)
