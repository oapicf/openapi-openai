@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ApiKeyList(
    @field:JsonProperty("object")
    val `object`: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<AdminApiKey>? = null,

    @field:JsonProperty("has_more")
    val hasMore: kotlin.Boolean? = null,

    @field:JsonProperty("first_id")
    val firstId: kotlin.String? = null,

    @field:JsonProperty("last_id")
    val lastId: kotlin.String? = null,

)
