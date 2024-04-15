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
 * Represents the url or the content of an image generated by the OpenAI API.
 * @param b64Json The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
 * @param url The URL of the generated image, if `response_format` is `url` (default).
 * @param revisedPrompt The prompt that was used to generate the image, if there was any revision to the prompt.
 */
data class Image(

    @Schema(example = "null", description = "The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.")
    @get:JsonProperty("b64_json") val b64Json: kotlin.String? = null,

    @Schema(example = "null", description = "The URL of the generated image, if `response_format` is `url` (default).")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "The prompt that was used to generate the image, if there was any revision to the prompt.")
    @get:JsonProperty("revised_prompt") val revisedPrompt: kotlin.String? = null
) {

}
