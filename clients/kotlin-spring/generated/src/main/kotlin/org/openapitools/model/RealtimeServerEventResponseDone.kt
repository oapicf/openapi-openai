package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeResponse
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
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.done`.
 * @param response 
 */
data class RealtimeServerEventResponseDone(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `response.done`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseDone.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("response", required = true) val response: RealtimeResponse
) {

    /**
    * The event type, must be `response.done`.
    * Values: responsePeriodDone
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodDone("response.done");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventResponseDone'")
            }
        }
    }

}

