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
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 * @param code A machine-readable error code.
 * @param message A human-readable error message.
 * @param &#x60;param&#x60; The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
 */
data class FineTuningJobError(

    @Schema(example = "null", required = true, description = "A machine-readable error code.")
    @get:JsonProperty("code", required = true) val code: kotlin.String,

    @Schema(example = "null", required = true, description = "A human-readable error message.")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", required = true, description = "The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.")
    @get:JsonProperty("param", required = true) val `param`: kotlin.String?
) {

}

