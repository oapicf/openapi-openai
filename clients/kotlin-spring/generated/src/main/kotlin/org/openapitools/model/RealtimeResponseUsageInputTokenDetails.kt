package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "The number of cached tokens used in the Response.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cached_tokens")
    @get:JsonProperty("cached_tokens") val cachedTokens: kotlin.Int? = null,

    @Schema(description = "The number of text tokens used in the Response.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("text_tokens")
    @get:JsonProperty("text_tokens") val textTokens: kotlin.Int? = null,

    @Schema(description = "The number of audio tokens used in the Response.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audio_tokens")
    @get:JsonProperty("audio_tokens") val audioTokens: kotlin.Int? = null
) {

}

