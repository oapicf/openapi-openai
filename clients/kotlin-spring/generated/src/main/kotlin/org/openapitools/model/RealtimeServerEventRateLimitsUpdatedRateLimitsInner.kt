package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * 
 * @param name The name of the rate limit (`requests`, `tokens`). 
 * @param limit The maximum allowed value for the rate limit.
 * @param remaining The remaining value before the limit is reached.
 * @param resetSeconds Seconds until the rate limit resets.
 */
data class RealtimeServerEventRateLimitsUpdatedRateLimitsInner(

    @Schema(description = "The name of the rate limit (`requests`, `tokens`). ")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: RealtimeServerEventRateLimitsUpdatedRateLimitsInner.Name? = null,

    @Schema(description = "The maximum allowed value for the rate limit.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("limit")
    @get:JsonProperty("limit") val limit: kotlin.Int? = null,

    @Schema(description = "The remaining value before the limit is reached.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("remaining")
    @get:JsonProperty("remaining") val remaining: kotlin.Int? = null,

    @Schema(description = "Seconds until the rate limit resets.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reset_seconds")
    @get:JsonProperty("reset_seconds") val resetSeconds: java.math.BigDecimal? = null
) {

    /**
    * The name of the rate limit (`requests`, `tokens`). 
    * Values: requests,tokens
    */
    enum class Name(@get:JsonValue val value: kotlin.String) {

        requests("requests"),
        tokens("tokens");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Name {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Name'")
            }
        }
    }

}

