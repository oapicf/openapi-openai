@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateVectorStoreRequest(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("expires_after")
    val expiresAfter: VectorStoreExpirationAfter? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
