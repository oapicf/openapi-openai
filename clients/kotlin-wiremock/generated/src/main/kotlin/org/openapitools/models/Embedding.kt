@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Embedding(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("embedding")
    val embedding: kotlin.collections.List<java.math.BigDecimal>,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

)
