@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogApiKeyCreatedData(
    @field:JsonProperty("scopes")
    val scopes: kotlin.collections.List<kotlin.String>? = null,

)
