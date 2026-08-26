@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogOrganizationUpdatedChangesRequested(
    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("settings")
    val settings: AuditLogOrganizationUpdatedChangesRequestedSettings? = null,

)
