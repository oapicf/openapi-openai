package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Project(
    /** The identifier, which can be referenced in API endpoints */
    val id: kotlin.String,
    /** The object type, which is always &#x60;organization.project&#x60; */
    val `object`: kotlin.String,
    /** The name of the project. This appears in reporting. */
    val name: kotlin.String,
    /** The Unix timestamp (in seconds) of when the project was created. */
    val createdAt: kotlin.Int,
    /** &#x60;active&#x60; or &#x60;archived&#x60; */
    val status: kotlin.String,
    /** The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;. */
    val archivedAt: kotlin.Int? = null
)
