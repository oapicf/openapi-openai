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
 * 
 * @param index The index of the tool call in the tool calls array.
 * @param type The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @param id The ID of the tool call object.
 * @param retrieval For now, this is always going to be an empty object.
 */
data class RunStepDeltaStepDetailsToolCallsRetrievalObject(

    @Schema(example = "null", required = true, description = "The index of the tool call in the tool calls array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "The type of tool call. This is always going to be `retrieval` for this type of tool call.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsRetrievalObject.Type,

    @Schema(example = "null", description = "The ID of the tool call object.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "For now, this is always going to be an empty object.")
    @get:JsonProperty("retrieval") val retrieval: kotlin.Any? = null
) {

    /**
    * The type of tool call. This is always going to be `retrieval` for this type of tool call.
    * Values: retrieval
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        retrieval("retrieval");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStepDeltaStepDetailsToolCallsRetrievalObject'")
            }
        }
    }

}

