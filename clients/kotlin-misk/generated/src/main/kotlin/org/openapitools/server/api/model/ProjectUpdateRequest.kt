package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectUpdateRequest(
    /** The updated name of the project, this name appears in reports. */
    val name: kotlin.String
)
