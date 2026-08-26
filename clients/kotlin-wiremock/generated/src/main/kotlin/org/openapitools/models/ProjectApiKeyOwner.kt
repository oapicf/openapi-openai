@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectApiKeyOwner(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("user")
    val user: ProjectUser? = null,

    @field:JsonProperty("service_account")
    val serviceAccount: ProjectServiceAccount? = null,

)
