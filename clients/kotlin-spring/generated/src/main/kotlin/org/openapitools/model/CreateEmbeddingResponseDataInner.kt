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
 * @param index 
 * @param &#x60;object&#x60; 
 * @param embedding 
 */
data class CreateEmbeddingResponseDataInner(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("object", required = true) val `object`: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("embedding", required = true) val embedding: kotlin.collections.List<java.math.BigDecimal>
) {

}

