package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunObjectRequiredActionSubmitToolOutputs
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
 * Details on the action required to continue the run. Will be `null` if no action is required.
 * @param type For now, this is always `submit_tool_outputs`.
 * @param submitToolOutputs 
 */
data class RunObjectRequiredAction(

    @Schema(example = "null", required = true, description = "For now, this is always `submit_tool_outputs`.")
    @get:JsonProperty("type", required = true) val type: RunObjectRequiredAction.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("submit_tool_outputs", required = true) val submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
) {

    /**
    * For now, this is always `submit_tool_outputs`.
    * Values: submit_tool_outputs
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("submit_tool_outputs") submit_tool_outputs("submit_tool_outputs")
    }

}

