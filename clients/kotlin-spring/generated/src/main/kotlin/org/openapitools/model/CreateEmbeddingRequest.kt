package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CreateEmbeddingRequestInput
import org.openapitools.model.CreateEmbeddingRequestModel
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
 * @param encodingFormat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
 * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
 */
data class CreateEmbeddingRequest(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("input")
    @get:JsonProperty("input", required = true) val input: CreateEmbeddingRequestInput,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("model")
    @get:JsonProperty("model", required = true) val model: CreateEmbeddingRequestModel,

    @Schema(example = "float", description = "The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("encoding_format")
    @get:JsonProperty("encoding_format") val encodingFormat: CreateEmbeddingRequest.EncodingFormat? = EncodingFormat.float,

    @get:Min(value=1)
    @Schema(description = "The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. ")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("dimensions")
    @get:JsonProperty("dimensions") val dimensions: kotlin.Int? = null,

    @Schema(example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user")
    @get:JsonProperty("user") val user: kotlin.String? = null
) {

    /**
    * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    * Values: float,base64
    */
    enum class EncodingFormat(@get:JsonValue val value: kotlin.String) {

        float("float"),
        base64("base64");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): EncodingFormat {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'EncodingFormat'")
            }
        }
    }

}

