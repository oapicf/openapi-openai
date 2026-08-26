package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectServiceAccountApiKey
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectServiceAccountCreateResponse(
    val `object`: kotlin.String,
    val id: kotlin.String,
    val name: kotlin.String,
    /** Service accounts can only have one role of type &#x60;member&#x60; */
    val role: kotlin.String,
    val createdAt: kotlin.Int,
    val apiKey: ProjectServiceAccountApiKey
)
