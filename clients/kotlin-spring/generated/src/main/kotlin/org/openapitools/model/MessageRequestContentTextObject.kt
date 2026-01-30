package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * The text content that is part of a message.
 * @param type Always `text`.
 * @param text Text content to be sent to the model
 */
data class MessageRequestContentTextObject(

    @Schema(example = "null", required = true, description = "Always `text`.")
    @get:JsonProperty("type", required = true) val type: MessageRequestContentTextObject.Type,

    @Schema(example = "null", required = true, description = "Text content to be sent to the model")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) {

    /**
    * Always `text`.
    * Values: text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageRequestContentTextObject'")
            }
        }
    }

}

