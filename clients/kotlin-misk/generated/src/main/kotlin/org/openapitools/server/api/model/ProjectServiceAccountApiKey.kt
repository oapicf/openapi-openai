package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectServiceAccountApiKey(
    /** The object type, which is always &#x60;organization.project.service_account.api_key&#x60; */
    val `object`: kotlin.String,
    val `value`: kotlin.String,
    val name: kotlin.String,
    val createdAt: kotlin.Int,
    val id: kotlin.String
)
