package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The monetary value in its associated currency.
 * @param `value` The numeric value of the cost.
 * @param currency Lowercase ISO-4217 currency e.g. \"usd\"
 */
data class CostsResultAmount(

    @Schema(description = "The numeric value of the cost.")
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: java.math.BigDecimal? = null,

    @Schema(description = "Lowercase ISO-4217 currency e.g. \"usd\"")
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: kotlin.String? = null
) {

}

