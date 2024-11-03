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
 * @param word The text content of the word.
 * @param start Start time of the word in seconds.
 * @param end End time of the word in seconds.
 */
data class TranscriptionWord(

    @Schema(example = "null", required = true, description = "The text content of the word.")
    @get:JsonProperty("word", required = true) val word: kotlin.String,

    @Schema(example = "null", required = true, description = "Start time of the word in seconds.")
    @get:JsonProperty("start", required = true) val start: kotlin.Float,

    @Schema(example = "null", required = true, description = "End time of the word in seconds.")
    @get:JsonProperty("end", required = true) val end: kotlin.Float
    ) {

}

