package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectCreateRequest(
    /** The friendly name of the project, this name appears in reports. */
    val name: kotlin.String
)
