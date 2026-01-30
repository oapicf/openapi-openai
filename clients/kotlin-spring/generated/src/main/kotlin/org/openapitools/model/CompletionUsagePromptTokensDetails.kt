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
 * Breakdown of tokens used in the prompt.
 * @param audioTokens Audio input tokens present in the prompt.
 * @param cachedTokens Cached tokens present in the prompt.
 */
data class CompletionUsagePromptTokensDetails(

    @Schema(example = "null", description = "Audio input tokens present in the prompt.")
    @get:JsonProperty("audio_tokens") val audioTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "Cached tokens present in the prompt.")
    @get:JsonProperty("cached_tokens") val cachedTokens: kotlin.Int? = null
) {

}

