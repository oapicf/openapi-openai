@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateEmbeddingResponse(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<Embedding>,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("usage")
    val usage: CreateEmbeddingResponseUsage,

)
