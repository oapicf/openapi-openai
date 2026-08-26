package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
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
 * The content part that was added.
 * @param type The content type (\"text\", \"audio\").
 * @param text The text content (if type is \"text\").
 * @param audio Base64-encoded audio data (if type is \"audio\").
 * @param transcript The transcript of the audio (if type is \"audio\").
 */
data class RealtimeServerEventResponseContentPartAddedPart(

    @Schema(description = "The content type (\"text\", \"audio\").")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: RealtimeServerEventResponseContentPartAddedPart.Type? = null,

    @Schema(description = "The text content (if type is \"text\").")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("text")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @Schema(description = "Base64-encoded audio data (if type is \"audio\").")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audio")
    @get:JsonProperty("audio") val audio: kotlin.String? = null,

    @Schema(description = "The transcript of the audio (if type is \"audio\").")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("transcript")
    @get:JsonProperty("transcript") val transcript: kotlin.String? = null
) {

    /**
    * The content type (\"text\", \"audio\").
    * Values: audio,text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        audio("audio"),
        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

