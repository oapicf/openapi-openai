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
 * @param code 
 * @param message 
 * @param `param` 
 * @param type 
 */
data class Error(

    @Schema(required = true, description = "")
    @param:JsonProperty("code", required = true)
    @get:JsonProperty("code", required = true) val code: kotlin.String?,

    @Schema(required = true, description = "")
    @param:JsonProperty("message", required = true)
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("param", required = true)
    @get:JsonProperty("param", required = true) val `param`: kotlin.String?,

    @Schema(required = true, description = "")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: kotlin.String
) {

}

