package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectUserUpdateRequest(
    /** &#x60;owner&#x60; or &#x60;member&#x60; */
    val role: kotlin.String
)
