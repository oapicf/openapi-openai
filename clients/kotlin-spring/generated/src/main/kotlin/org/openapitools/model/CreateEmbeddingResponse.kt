package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateEmbeddingResponseUsage
import org.openapitools.model.Embedding
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
 * @param &#x60;data&#x60; The list of embeddings generated by the model.
 * @param model The name of the model used to generate the embedding.
 * @param &#x60;object&#x60; The object type, which is always \"list\".
 * @param usage 
 */
data class CreateEmbeddingResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "The list of embeddings generated by the model.")
    @get:JsonProperty("data", required = true) val `data`: kotlin.collections.List<Embedding>,

    @Schema(example = "null", required = true, description = "The name of the model used to generate the embedding.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always \"list\".")
    @get:JsonProperty("object", required = true) val `object`: CreateEmbeddingResponse.`Object`,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("usage", required = true) val usage: CreateEmbeddingResponseUsage
) {

    /**
    * The object type, which is always \"list\".
    * Values: list
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("list") list("list")
    }

}

