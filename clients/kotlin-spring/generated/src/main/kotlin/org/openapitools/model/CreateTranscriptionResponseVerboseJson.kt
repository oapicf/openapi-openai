package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TranscriptionSegment
import org.openapitools.model.TranscriptionWord
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
 * Represents a verbose json transcription response returned by model, based on the provided input.
 * @param language The language of the input audio.
 * @param duration The duration of the input audio.
 * @param text The transcribed text.
 * @param words Extracted words and their corresponding timestamps.
 * @param segments Segments of the transcribed text and their corresponding details.
 */
data class CreateTranscriptionResponseVerboseJson(

    @Schema(example = "null", required = true, description = "The language of the input audio.")
    @get:JsonProperty("language", required = true) val language: kotlin.String,

    @Schema(example = "null", required = true, description = "The duration of the input audio.")
    @get:JsonProperty("duration", required = true) val duration: kotlin.String,

    @Schema(example = "null", required = true, description = "The transcribed text.")
    @get:JsonProperty("text", required = true) val text: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Extracted words and their corresponding timestamps.")
    @get:JsonProperty("words") val words: kotlin.collections.List<TranscriptionWord>? = null,

    @field:Valid
    @Schema(example = "null", description = "Segments of the transcribed text and their corresponding details.")
    @get:JsonProperty("segments") val segments: kotlin.collections.List<TranscriptionSegment>? = null
) {

}

