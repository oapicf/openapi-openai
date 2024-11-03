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
 * The usage information for the request.
 * @param promptTokens The number of tokens used by the prompt.
 * @param totalTokens The total number of tokens used by the request.
 */
data class CreateEmbeddingResponseUsage(

    @Schema(example = "null", required = true, description = "The number of tokens used by the prompt.")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The total number of tokens used by the request.")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
    ) {

}

