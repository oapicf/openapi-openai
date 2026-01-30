package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
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
 * The details of the run step.
 * @param type Always `message_creation`.
 * @param messageCreation 
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
 */
data class RunStepDeltaObjectDeltaStepDetails(

    @Schema(example = "null", required = true, description = "Always `message_creation`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaObjectDeltaStepDetails.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("message_creation") val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null,

    @field:Valid
    @Schema(example = "null", description = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. ")
    @get:JsonProperty("tool_calls") val toolCalls: kotlin.collections.List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>? = null
) {

    /**
    * Always `message_creation`.
    * Values: message_creation,tool_calls
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        message_creation("message_creation"),
        tool_calls("tool_calls");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStepDeltaObjectDeltaStepDetails'")
            }
        }
    }

}

