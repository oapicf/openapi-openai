package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * The function definition.
 * @param name The name of the function.
 * @param arguments The arguments that the model expects you to pass to the function.
 */
data class RunToolCallObjectFunction(

    @Schema(example = "null", required = true, description = "The name of the function.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "The arguments that the model expects you to pass to the function.")
    @get:JsonProperty("arguments", required = true) val arguments: kotlin.String
    ) {

}

