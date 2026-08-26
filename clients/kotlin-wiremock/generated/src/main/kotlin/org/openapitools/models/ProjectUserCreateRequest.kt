@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectUserCreateRequest(
    @field:JsonProperty("user_id")
    val userId: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

)
