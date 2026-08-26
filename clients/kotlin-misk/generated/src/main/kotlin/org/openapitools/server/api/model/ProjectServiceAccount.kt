package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectServiceAccount(
    /** The object type, which is always &#x60;organization.project.service_account&#x60; */
    val `object`: kotlin.String,
    /** The identifier, which can be referenced in API endpoints */
    val id: kotlin.String,
    /** The name of the service account */
    val name: kotlin.String,
    /** &#x60;owner&#x60; or &#x60;member&#x60; */
    val role: kotlin.String,
    /** The Unix timestamp (in seconds) of when the service account was created */
    val createdAt: kotlin.Int
)
