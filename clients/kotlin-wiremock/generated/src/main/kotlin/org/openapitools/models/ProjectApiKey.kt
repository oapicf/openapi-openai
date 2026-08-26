@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProjectApiKey(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("redacted_value")
    val redactedValue: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("owner")
    val owner: ProjectApiKeyOwner,

)
