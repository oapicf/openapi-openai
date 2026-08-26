@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogServiceAccountCreated(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: AuditLogServiceAccountCreatedData? = null,

)
