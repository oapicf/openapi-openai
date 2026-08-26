@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateVectorStoreRequest(
    @field:JsonProperty("file_ids")
    val fileIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("expires_after")
    val expiresAfter: VectorStoreExpirationAfter? = null,

    @field:JsonProperty("chunking_strategy")
    val chunkingStrategy: CreateVectorStoreRequestChunkingStrategy? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
