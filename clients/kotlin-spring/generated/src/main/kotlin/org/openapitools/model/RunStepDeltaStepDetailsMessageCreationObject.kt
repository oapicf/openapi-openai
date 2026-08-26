package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
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
data class RunStepDeltaStepDetailsMessageCreationObject(

    @Schema(required = true, description = "Always `message_creation`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsMessageCreationObject.Type,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message_creation")
    @get:JsonProperty("message_creation") val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null
) : RunStepDeltaObjectDeltaStepDetails {

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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

