package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaContentImageFileObject
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile
import org.openapitools.model.MessageDeltaContentImageUrlObject
import org.openapitools.model.MessageDeltaContentImageUrlObjectImageUrl
import org.openapitools.model.MessageDeltaContentRefusalObject
import org.openapitools.model.MessageDeltaContentTextObject
import org.openapitools.model.MessageDeltaContentTextObjectText
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
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 * @param refusal 
 * @param imageUrl 
 */
data class MessageDeltaObjectDeltaContentInner(

    @Schema(example = "null", required = true, description = "The index of the content part in the message.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `image_file`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaObjectDeltaContentInner.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image_file") val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("text") val text: MessageDeltaContentTextObjectText? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refusal") val refusal: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image_url") val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null
) {

    /**
    * Always `image_file`.
    * Values: image_file,text,refusal,image_url
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_file("image_file"),
        text("text"),
        refusal("refusal"),
        image_url("image_url");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageDeltaObjectDeltaContentInner'")
            }
        }
    }

}

