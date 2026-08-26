package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProjectUpdatedChangesRequested(
    /** The title of the project as seen on the dashboard. */
    val title: kotlin.String? = null
)
