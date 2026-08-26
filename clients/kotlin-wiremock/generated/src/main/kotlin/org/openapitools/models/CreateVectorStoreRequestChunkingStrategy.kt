@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateVectorStoreRequestChunkingStrategy(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("static")
    val static: StaticChunkingStrategy,

)
