@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdminApiKeyOwner(
    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Long? = null,

    @field:JsonProperty("role")
    val role: kotlin.String? = null,

)
