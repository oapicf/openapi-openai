@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogUserUpdatedChangesRequested(
    @field:JsonProperty("role")
    val role: kotlin.String? = null,

)
