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
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 * @param type The type of error.
 * @param code Error code, if any.
 */
data class RealtimeResponseStatusDetailsError(

    @Schema(example = "null", description = "The type of error.")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "Error code, if any.")
    @get:JsonProperty("code") val code: kotlin.String? = null
) {

}

