package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProjectCreatedData(
    /** The project name. */
    val name: kotlin.String? = null,
    /** The title of the project as seen on the dashboard. */
    val title: kotlin.String? = null
)
