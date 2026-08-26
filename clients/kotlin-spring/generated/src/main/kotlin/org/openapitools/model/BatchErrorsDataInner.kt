package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "An error code identifying the error type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(description = "A human-readable message providing more details about the error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(description = "The name of the parameter that caused the error, if applicable.")
    @param:JsonProperty("param")
    @get:JsonProperty("param") val `param`: kotlin.String? = null,

    @Schema(description = "The line number of the input file where the error occurred, if applicable.")
    @param:JsonProperty("line")
    @get:JsonProperty("line") val line: kotlin.Int? = null
) {

}

