package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
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
 * Represents a transcription response returned by model, based on the provided input.
 * @param text The transcribed text.
 */
data class CreateTranscriptionResponseJson(

    @Schema(required = true, description = "The transcribed text.")
    @param:JsonProperty("text")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) : CreateTranscription200Response {

}

