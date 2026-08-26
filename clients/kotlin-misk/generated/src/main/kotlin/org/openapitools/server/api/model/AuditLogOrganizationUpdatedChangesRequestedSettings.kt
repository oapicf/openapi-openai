package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogOrganizationUpdatedChangesRequestedSettings(
    /** Visibility of the threads page which shows messages created with the Assistants API and Playground. One of &#x60;ANY_ROLE&#x60;, &#x60;OWNERS&#x60;, or &#x60;NONE&#x60;. */
    val threadsUiVisibility: kotlin.String? = null,
    /** Visibility of the usage dashboard which shows activity and costs for your organization. One of &#x60;ANY_ROLE&#x60; or &#x60;OWNERS&#x60;. */
    val usageDashboardVisibility: kotlin.String? = null
)
