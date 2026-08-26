package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
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
 * 
 * @param toolCallId The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
 * @param output The output of the tool call to be submitted to continue the run.
 */
data class SubmitToolOutputsRunRequestToolOutputsInner(

    @Schema(description = "The ID of the tool call in the `required_action` object within the run object the output is being submitted for.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tool_call_id")
    @get:JsonProperty("tool_call_id") val toolCallId: kotlin.String? = null,

    @Schema(description = "The output of the tool call to be submitted to continue the run.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("output")
    @get:JsonProperty("output") val output: kotlin.String? = null
) {

}

