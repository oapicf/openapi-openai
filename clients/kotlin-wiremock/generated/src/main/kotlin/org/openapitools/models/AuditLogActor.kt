@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogActor(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("session")
    val session: AuditLogActorSession? = null,

    @field:JsonProperty("api_key")
    val apiKey: AuditLogActorApiKey? = null,

)
