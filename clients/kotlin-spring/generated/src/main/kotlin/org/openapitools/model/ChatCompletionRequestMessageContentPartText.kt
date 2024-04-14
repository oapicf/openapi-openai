package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param type The type of the content part.
 * @param text The text content.
 */
data class ChatCompletionRequestMessageContentPartText(

    @Schema(example = "null", required = true, description = "The type of the content part.")
    @get:JsonProperty("type", required = true) val type: ChatCompletionRequestMessageContentPartText.Type,

    @Schema(example = "null", required = true, description = "The text content.")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) {

    /**
    * The type of the content part.
    * Values: text
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("text") text("text")
    }

}

