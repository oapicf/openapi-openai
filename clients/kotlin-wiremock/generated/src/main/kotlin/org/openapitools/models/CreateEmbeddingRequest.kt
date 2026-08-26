@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateEmbeddingRequest(
    @field:JsonProperty("input")
    val input: CreateEmbeddingRequestInput,

    @field:JsonProperty("model")
    val model: CreateEmbeddingRequestModel,

    @field:JsonProperty("encoding_format")
    val encodingFormat: kotlin.String? = EncodingFormat.float,

    @field:JsonProperty("dimensions")
    val dimensions: kotlin.Int? = null,

    @field:JsonProperty("user")
    val user: kotlin.String? = null,

)
