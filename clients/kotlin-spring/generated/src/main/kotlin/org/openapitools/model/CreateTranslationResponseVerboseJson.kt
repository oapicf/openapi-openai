package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TranscriptionSegment
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
 * @param language The language of the output translation (always `english`).
 * @param duration The duration of the input audio.
 * @param text The translated text.
 * @param segments Segments of the translated text and their corresponding details.
 */
data class CreateTranslationResponseVerboseJson(

    @Schema(example = "null", required = true, description = "The language of the output translation (always `english`).")
    @get:JsonProperty("language", required = true) val language: kotlin.String,

    @Schema(example = "null", required = true, description = "The duration of the input audio.")
    @get:JsonProperty("duration", required = true) val duration: kotlin.String,

    @Schema(example = "null", required = true, description = "The translated text.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Segments of the translated text and their corresponding details.")
    @get:JsonProperty("segments") val segments: kotlin.collections.List<TranscriptionSegment>? = null
) {

}

