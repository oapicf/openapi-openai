package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProjectServiceAccount
import org.openapitools.server.api.model.ProjectUser
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProjectApiKeyOwner(
    /** &#x60;user&#x60; or &#x60;service_account&#x60; */
    val type: kotlin.String? = null,
    val user: ProjectUser? = null,
    val serviceAccount: ProjectServiceAccount? = null
)
