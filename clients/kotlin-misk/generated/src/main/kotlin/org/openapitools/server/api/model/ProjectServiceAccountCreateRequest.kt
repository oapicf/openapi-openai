package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectServiceAccountCreateRequest(
    /** The name of the service account being created. */
    val name: kotlin.String
)
