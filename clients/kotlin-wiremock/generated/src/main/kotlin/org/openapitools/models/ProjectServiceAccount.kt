@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectServiceAccount(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

)
