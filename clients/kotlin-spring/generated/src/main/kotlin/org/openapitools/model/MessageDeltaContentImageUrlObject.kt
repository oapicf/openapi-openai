package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl
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
 * @param index The index of the content part in the message.
 * @param type Always `image_url`.
 * @param imageUrl 
 */
data class MessageDeltaContentImageUrlObject(

    @Schema(required = true, description = "The index of the content part in the message.")
    @param:JsonProperty("index")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(required = true, description = "Always `image_url`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentImageUrlObject.Type,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("image_url")
    @get:JsonProperty("image_url") val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null
) : MessageDeltaObjectDeltaContentInner {

    /**
    * Always `image_url`.
    * Values: image_url
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_url("image_url");

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

