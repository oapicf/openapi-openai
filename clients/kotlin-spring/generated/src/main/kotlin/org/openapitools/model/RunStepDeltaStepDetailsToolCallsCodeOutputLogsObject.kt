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
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
data class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(

    @Schema(required = true, description = "The index of the output in the outputs array.")
    @param:JsonProperty("index")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(required = true, description = "Always `logs`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type,

    @Schema(description = "The text output from the Code Interpreter tool call.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("logs")
    @get:JsonProperty("logs") val logs: kotlin.String? = null
) : RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {

    /**
    * Always `logs`.
    * Values: logs
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        logs("logs");

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

