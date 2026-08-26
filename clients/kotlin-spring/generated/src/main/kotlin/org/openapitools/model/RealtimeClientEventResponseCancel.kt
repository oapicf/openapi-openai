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
 * Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 * @param type The event type, must be `response.cancel`.
 * @param eventId Optional client-generated ID used to identify this event.
 * @param responseId A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
 */
data class RealtimeClientEventResponseCancel(

    @Schema(required = true, description = "The event type, must be `response.cancel`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventResponseCancel.Type,

    @Schema(description = "Optional client-generated ID used to identify this event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null,

    @Schema(description = "A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. ")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_id")
    @get:JsonProperty("response_id") val responseId: kotlin.String? = null
) {

    /**
    * The event type, must be `response.cancel`.
    * Values: responsePeriodCancel
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodCancel("response.cancel");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

