package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SubmitToolOutputsRunRequestToolOutputsInner
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
 * @param toolOutputs A list of tools for which the outputs are being submitted.
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 */
data class SubmitToolOutputsRunRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "A list of tools for which the outputs are being submitted.")
    @get:JsonProperty("tool_outputs", required = true) val toolOutputs: kotlin.collections.List<SubmitToolOutputsRunRequestToolOutputsInner>,

    @Schema(example = "null", description = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
    @get:JsonProperty("stream") val stream: kotlin.Boolean? = null
    ) {

}

