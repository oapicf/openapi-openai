@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VectorStoreExpirationAfter(
    @field:JsonProperty("anchor")
    val anchor: kotlin.String,

    @field:JsonProperty("days")
    val days: kotlin.Int,

)
