package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Represents an embedding vector returned by embedding endpoint. 
 * @param index The index of the embedding in the list of embeddings.
 * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
 * @param &#x60;object&#x60; The object type, which is always \"embedding\".
 */
data class Embedding(

    @Schema(example = "null", required = true, description = "The index of the embedding in the list of embeddings.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). ")
    @get:JsonProperty("embedding", required = true) val embedding: kotlin.collections.List<java.math.BigDecimal>,

    @Schema(example = "null", required = true, description = "The object type, which is always \"embedding\".")
    @get:JsonProperty("object", required = true) val `object`: Embedding.`Object`
) {

    /**
    * The object type, which is always \"embedding\".
    * Values: embedding
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("embedding") embedding("embedding")
    }

}

