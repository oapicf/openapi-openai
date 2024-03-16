package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateModerationResponseResultsInner
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
 * @param id 
 * @param model 
 * @param results 
 */
data class CreateModerationResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("results", required = true) val results: kotlin.collections.List<CreateModerationResponseResultsInner>
) {

}

