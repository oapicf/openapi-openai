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
 * The per-line training example of a fine-tuning input file for completions models
 * @param prompt The input prompt for this training example.
 * @param completion The desired completion for this training example.
 */
data class FineTuneCompletionRequestInput(

    @Schema(example = "null", description = "The input prompt for this training example.")
    @get:JsonProperty("prompt") val prompt: kotlin.String? = null,

    @Schema(example = "null", description = "The desired completion for this training example.")
    @get:JsonProperty("completion") val completion: kotlin.String? = null
) {

}

