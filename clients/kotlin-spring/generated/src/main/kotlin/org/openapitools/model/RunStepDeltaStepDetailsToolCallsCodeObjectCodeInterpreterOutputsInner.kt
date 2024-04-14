package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
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
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
data class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(

    @Schema(example = "null", required = true, description = "The index of the output in the outputs array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `logs`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type,

    @Schema(example = "null", description = "The text output from the Code Interpreter tool call.")
    @get:JsonProperty("logs") val logs: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? = null
) {

    /**
    * Always `logs`.
    * Values: logs,image
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("logs") logs("logs"),
        @JsonProperty("image") image("image")
    }

}

