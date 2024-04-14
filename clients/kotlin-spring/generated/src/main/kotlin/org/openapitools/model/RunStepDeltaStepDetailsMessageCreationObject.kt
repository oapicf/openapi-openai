package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", required = true, description = "Always `message_creation`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsMessageCreationObject.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("message_creation") val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null
) {

    /**
    * Always `message_creation`.
    * Values: message_creation
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("message_creation") message_creation("message_creation")
    }

}

