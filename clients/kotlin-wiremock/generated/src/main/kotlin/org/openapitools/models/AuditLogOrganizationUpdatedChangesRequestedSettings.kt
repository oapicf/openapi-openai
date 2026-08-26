@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuditLogOrganizationUpdatedChangesRequestedSettings(
    @field:JsonProperty("threads_ui_visibility")
    val threadsUiVisibility: kotlin.String? = null,

    @field:JsonProperty("usage_dashboard_visibility")
    val usageDashboardVisibility: kotlin.String? = null,

)
