@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("email")
    val email: kotlin.String,

    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("added_at")
    val addedAt: kotlin.Int,

)
