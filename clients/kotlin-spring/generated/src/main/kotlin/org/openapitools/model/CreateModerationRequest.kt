package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateModerationRequestInput
import org.openapitools.model.CreateModerationRequestModel
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
 * @param input 
 * @param model 
 */
data class CreateModerationRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("input", required = true) val input: CreateModerationRequestInput,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: CreateModerationRequestModel? = null
    ) {

}

