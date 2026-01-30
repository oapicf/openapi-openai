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
 * @param maxChunkSizeTokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
 * @param chunkOverlapTokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
 */
data class StaticChunkingStrategyStatic(

    @get:Min(value=100)
    @get:Max(value=4096)
    @Schema(example = "null", required = true, description = "The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.")
    @get:JsonProperty("max_chunk_size_tokens", required = true) val maxChunkSizeTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. ")
    @get:JsonProperty("chunk_overlap_tokens", required = true) val chunkOverlapTokens: kotlin.Int
) {

}

