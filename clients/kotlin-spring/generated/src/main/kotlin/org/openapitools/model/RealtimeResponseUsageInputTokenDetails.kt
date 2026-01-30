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
 * Details about the input tokens used in the Response.
 * @param cachedTokens The number of cached tokens used in the Response.
 * @param textTokens The number of text tokens used in the Response.
 * @param audioTokens The number of audio tokens used in the Response.
 */
data class RealtimeResponseUsageInputTokenDetails(

    @Schema(example = "null", description = "The number of cached tokens used in the Response.")
    @get:JsonProperty("cached_tokens") val cachedTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of text tokens used in the Response.")
    @get:JsonProperty("text_tokens") val textTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of audio tokens used in the Response.")
    @get:JsonProperty("audio_tokens") val audioTokens: kotlin.Int? = null
) {

}

