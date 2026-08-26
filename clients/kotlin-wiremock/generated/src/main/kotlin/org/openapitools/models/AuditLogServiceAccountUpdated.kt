@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogServiceAccountUpdated(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("changes_requested")
    val changesRequested: AuditLogServiceAccountUpdatedChangesRequested? = null,

)
