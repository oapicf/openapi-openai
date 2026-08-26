@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdminApiKey(
    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("redacted_value")
    val redactedValue: kotlin.String? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Long? = null,

    @field:JsonProperty("owner")
    val owner: AdminApiKeyOwner? = null,

)
