@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogApiKeyCreated(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: AuditLogApiKeyCreatedData? = null,

)
