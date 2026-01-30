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
 * 
 * @param code An error code identifying the error type.
 * @param message A human-readable message providing more details about the error.
 * @param &#x60;param&#x60; The name of the parameter that caused the error, if applicable.
 * @param line The line number of the input file where the error occurred, if applicable.
 */
data class BatchErrorsDataInner(

    @Schema(example = "null", description = "An error code identifying the error type.")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(example = "null", description = "A human-readable message providing more details about the error.")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "The name of the parameter that caused the error, if applicable.")
    @get:JsonProperty("param") val `param`: kotlin.String? = null,

    @Schema(example = "null", description = "The line number of the input file where the error occurred, if applicable.")
    @get:JsonProperty("line") val line: kotlin.Int? = null
) {

}

