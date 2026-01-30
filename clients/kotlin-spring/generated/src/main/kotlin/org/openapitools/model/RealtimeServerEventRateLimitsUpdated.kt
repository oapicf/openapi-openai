package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeServerEventRateLimitsUpdatedRateLimitsInner
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
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `rate_limits.updated`.
 * @param rateLimits List of rate limit information.
 */
data class RealtimeServerEventRateLimitsUpdated(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `rate_limits.updated`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventRateLimitsUpdated.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "List of rate limit information.")
    @get:JsonProperty("rate_limits", required = true) val rateLimits: kotlin.collections.List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>
) {

    /**
    * The event type, must be `rate_limits.updated`.
    * Values: rate_limitsPeriodUpdated
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        rate_limitsPeriodUpdated("rate_limits.updated");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventRateLimitsUpdated'")
            }
        }
    }

}

