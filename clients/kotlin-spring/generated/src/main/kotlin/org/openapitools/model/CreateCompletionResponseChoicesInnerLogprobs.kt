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
 * @param tokens 
 * @param tokenLogprobs 
 * @param topLogprobs 
 * @param textOffset 
 */
data class CreateCompletionResponseChoicesInnerLogprobs(

    @Schema(example = "null", description = "")
    @get:JsonProperty("tokens") val tokens: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("token_logprobs") val tokenLogprobs: kotlin.collections.List<java.math.BigDecimal>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("top_logprobs") val topLogprobs: kotlin.collections.List<kotlin.Any>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("text_offset") val textOffset: kotlin.collections.List<kotlin.Int>? = null
) {

}

