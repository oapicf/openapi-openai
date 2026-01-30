package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageContentImageUrlObjectImageUrl
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
 * References an image URL in the content of a message.
 * @param type The type of the content part.
 * @param imageUrl 
 */
data class MessageContentImageUrlObject(

    @Schema(example = "null", required = true, description = "The type of the content part.")
    @get:JsonProperty("type", required = true) val type: MessageContentImageUrlObject.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_url", required = true) val imageUrl: MessageContentImageUrlObjectImageUrl
) {

    /**
    * The type of the content part.
    * Values: image_url
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_url("image_url");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageContentImageUrlObject'")
            }
        }
    }

}

