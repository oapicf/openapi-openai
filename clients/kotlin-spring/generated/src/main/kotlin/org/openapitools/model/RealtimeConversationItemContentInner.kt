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
 * 
 * @param type The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
 * @param text The text content, used for `input_text` and `text` content types. 
 * @param id ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
 * @param audio Base64-encoded audio bytes, used for `input_audio` content type. 
 * @param transcript The transcript of the audio, used for `input_audio` content type. 
 */
data class RealtimeConversationItemContentInner(

    @Schema(example = "null", description = "The content type (`input_text`, `input_audio`, `item_reference`, `text`). ")
    @get:JsonProperty("type") val type: RealtimeConversationItemContentInner.Type? = null,

    @Schema(example = "null", description = "The text content, used for `input_text` and `text` content types. ")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @Schema(example = "null", description = "ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. ")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "Base64-encoded audio bytes, used for `input_audio` content type. ")
    @get:JsonProperty("audio") val audio: kotlin.String? = null,

    @Schema(example = "null", description = "The transcript of the audio, used for `input_audio` content type. ")
    @get:JsonProperty("transcript") val transcript: kotlin.String? = null
) {

    /**
    * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
    * Values: input_audio,input_text,item_reference,text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        input_audio("input_audio"),
        input_text("input_text"),
        item_reference("item_reference"),
        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeConversationItemContentInner'")
            }
        }
    }

}

