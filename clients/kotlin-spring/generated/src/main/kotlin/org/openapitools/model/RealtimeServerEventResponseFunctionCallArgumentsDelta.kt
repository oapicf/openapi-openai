package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Returned when the model-generated function call arguments are updated. 
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.function_call_arguments.delta`. 
 * @param responseId The ID of the response.
 * @param itemId The ID of the function call item.
 * @param outputIndex The index of the output item in the response.
 * @param callId The ID of the function call.
 * @param delta The arguments delta as a JSON string.
 */
data class RealtimeServerEventResponseFunctionCallArgumentsDelta(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `response.function_call_arguments.delta`. ")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseFunctionCallArgumentsDelta.Type,

    @Schema(example = "null", required = true, description = "The ID of the response.")
    @get:JsonProperty("response_id", required = true) val responseId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the function call item.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the output item in the response.")
    @get:JsonProperty("output_index", required = true) val outputIndex: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the function call.")
    @get:JsonProperty("call_id", required = true) val callId: kotlin.String,

    @Schema(example = "null", required = true, description = "The arguments delta as a JSON string.")
    @get:JsonProperty("delta", required = true) val delta: kotlin.String
) {

    /**
    * The event type, must be `response.function_call_arguments.delta`. 
    * Values: responsePeriodFunction_call_argumentsPeriodDelta
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodFunction_call_argumentsPeriodDelta("response.function_call_arguments.delta");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventResponseFunctionCallArgumentsDelta'")
            }
        }
    }

}

