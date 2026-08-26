@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CostsResultAmount(
    @field:JsonProperty("value")
    val `value`: java.math.BigDecimal? = null,

    @field:JsonProperty("currency")
    val currency: kotlin.String? = null,

)
