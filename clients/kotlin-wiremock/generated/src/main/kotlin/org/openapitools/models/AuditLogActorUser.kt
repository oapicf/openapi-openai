@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogActorUser(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("email")
    val email: kotlin.String? = null,

)
