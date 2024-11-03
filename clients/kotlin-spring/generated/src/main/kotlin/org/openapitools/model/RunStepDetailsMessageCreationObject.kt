package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDetailsMessageCreationObjectMessageCreation
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
 * Details of the message creation by the run step.
 * @param type Always `message_creation`.
 * @param messageCreation 
 */
data class RunStepDetailsMessageCreationObject(

    @Schema(example = "null", required = true, description = "Always `message_creation`.")
    @get:JsonProperty("type", required = true) val type: RunStepDetailsMessageCreationObject.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message_creation", required = true) val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation
    ) {

    /**
    * Always `message_creation`.
    * Values: message_creation
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        message_creation("message_creation");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

