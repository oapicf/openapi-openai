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
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
data class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(

    @Schema(example = "null", required = true, description = "The index of the output in the outputs array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `logs`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type,

    @Schema(example = "null", description = "The text output from the Code Interpreter tool call.")
    @get:JsonProperty("logs") val logs: kotlin.String? = null
    ) {

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
                return values().first{it -> it.value == value}
            }
        }
    }

}

