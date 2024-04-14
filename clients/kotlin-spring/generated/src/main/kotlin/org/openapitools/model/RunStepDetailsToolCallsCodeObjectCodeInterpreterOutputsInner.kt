package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObject
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputLogsObject
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
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 * @param image 
 */
data class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(

    @Schema(example = "null", required = true, description = "Always `logs`.")
    @get:JsonProperty("type", required = true) val type: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.Type,

    @Schema(example = "null", required = true, description = "The text output from the Code Interpreter tool call.")
    @get:JsonProperty("logs", required = true) val logs: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image", required = true) val image: RunStepDetailsToolCallsCodeOutputImageObjectImage
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

