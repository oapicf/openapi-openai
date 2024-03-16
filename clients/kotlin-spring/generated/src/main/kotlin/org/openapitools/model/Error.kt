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
 * @param type 
 * @param message 
 * @param &#x60;param&#x60; 
 * @param code 
 */
data class Error(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("param", required = true) val `param`: kotlin.String?,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("code", required = true) val code: kotlin.String?
) {

}

