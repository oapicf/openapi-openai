package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
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
 * @param index The index of the output in the outputs array.
 * @param type Always `image`.
 * @param image 
 */
data class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(

    @Schema(example = "null", required = true, description = "The index of the output in the outputs array.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `image`.")
    @get:JsonProperty("type", required = true) val type: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? = null
) {

    /**
    * Always `image`.
    * Values: image
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("image") image("image")
    }

}

