package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsMessageCreationObject
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation
import org.openapitools.model.RunStepDetailsToolCallsObject
import org.openapitools.model.RunStepDetailsToolCallsObjectToolCallsInner
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
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
 */
data class RunStepObjectStepDetails(

    @Schema(example = "null", required = true, description = "Always `message_creation`.")
    @get:JsonProperty("type", required = true) val type: RunStepObjectStepDetails.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message_creation", required = true) val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation,

    @field:Valid
    @Schema(example = "null", required = true, description = "An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. ")
    @get:JsonProperty("tool_calls", required = true) val toolCalls: kotlin.collections.List<RunStepDetailsToolCallsObjectToolCallsInner>
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
                return values().first{it -> it.value == value}
            }
        }
    }

}

