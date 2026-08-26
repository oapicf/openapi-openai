@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteRequest(
    @field:JsonProperty("email")
    val email: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("projects")
    val projects: kotlin.collections.List<InviteRequestProjectsInner>? = null,

)
