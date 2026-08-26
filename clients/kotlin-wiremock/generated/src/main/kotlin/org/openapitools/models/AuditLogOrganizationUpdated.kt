@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogOrganizationUpdated(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("changes_requested")
    val changesRequested: AuditLogOrganizationUpdatedChangesRequested? = null,

)
