package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CostsResultAmount(
    /** The numeric value of the cost. */
    val `value`: java.math.BigDecimal? = null,
    /** Lowercase ISO-4217 currency e.g. \&quot;usd\&quot; */
    val currency: kotlin.String? = null
)
