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
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 */
data class BatchRequestOutputError(

    @Schema(example = "null", description = "A machine-readable error code.")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(example = "null", description = "A human-readable error message.")
    @get:JsonProperty("message") val message: kotlin.String? = null
) {

}

