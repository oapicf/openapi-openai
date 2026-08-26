@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListFilesResponse(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<OpenAIFile>,

    @field:JsonProperty("first_id")
    val firstId: kotlin.String,

    @field:JsonProperty("last_id")
    val lastId: kotlin.String,

    @field:JsonProperty("has_more")
    val hasMore: kotlin.Boolean,

)
