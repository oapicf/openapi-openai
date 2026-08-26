package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectUser(
    /** The object type, which is always &#x60;organization.project.user&#x60; */
    val `object`: kotlin.String,
    /** The identifier, which can be referenced in API endpoints */
    val id: kotlin.String,
    /** The name of the user */
    val name: kotlin.String,
    /** The email address of the user */
    val email: kotlin.String,
    /** &#x60;owner&#x60; or &#x60;member&#x60; */
    val role: kotlin.String,
    /** The Unix timestamp (in seconds) of when the project was added. */
    val addedAt: kotlin.Int
)
