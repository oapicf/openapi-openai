@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogServiceAccountUpdatedChangesRequested(
    @field:JsonProperty("role")
    val role: kotlin.String? = null,

)
