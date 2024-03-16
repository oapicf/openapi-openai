package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateEmbeddingResponseDataInner
import org.openapitools.model.CreateEmbeddingResponseUsage
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
 * @param &#x60;object&#x60; 
 * @param model 
 * @param &#x60;data&#x60; 
 * @param usage 
 */
data class CreateEmbeddingResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<CreateEmbeddingResponseDataInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("usage", required = true) val usage: CreateEmbeddingResponseUsage
) {

}

