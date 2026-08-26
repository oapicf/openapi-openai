package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectApiKeyOwner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectApiKey(
    /** The object type, which is always &#x60;organization.project.api_key&#x60; */
    val `object`: kotlin.String,
    /** The redacted value of the API key */
    val redactedValue: kotlin.String,
    /** The name of the API key */
    val name: kotlin.String,
    /** The Unix timestamp (in seconds) of when the API key was created */
    val createdAt: kotlin.Int,
    /** The identifier, which can be referenced in API endpoints */
    val id: kotlin.String,
    val owner: ProjectApiKeyOwner
)
