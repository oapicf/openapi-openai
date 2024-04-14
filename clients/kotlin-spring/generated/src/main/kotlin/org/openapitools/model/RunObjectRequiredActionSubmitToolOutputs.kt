package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RunToolCallObject
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
 * Details on the tool outputs needed for this run to continue.
 * @param toolCalls A list of the relevant tool calls.
 */
data class RunObjectRequiredActionSubmitToolOutputs(

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of the relevant tool calls.")
    @get:JsonProperty("tool_calls", required = true) val toolCalls: kotlin.collections.List<RunToolCallObject>
) {

}

