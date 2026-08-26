@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteRequestProjectsInner(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

)
