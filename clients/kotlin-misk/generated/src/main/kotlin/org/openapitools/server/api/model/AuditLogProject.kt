package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuditLogProject(
    /** The project ID. */
    val id: kotlin.String? = null,
    /** The project title. */
    val name: kotlin.String? = null
)
