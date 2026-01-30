package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageContentImageFileObject
import org.openapitools.model.MessageContentImageFileObjectImageFile
import org.openapitools.model.MessageContentImageUrlObject
import org.openapitools.model.MessageContentImageUrlObjectImageUrl
import org.openapitools.model.MessageContentRefusalObject
import org.openapitools.model.MessageContentTextObject
import org.openapitools.model.MessageContentTextObjectText
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
 * @param type Always `image_file`.
 * @param imageFile 
 * @param imageUrl 
 * @param text 
 * @param refusal 
 */
data class MessageObjectContentInner(

    @Schema(example = "null", required = true, description = "Always `image_file`.")
    @get:JsonProperty("type", required = true) val type: MessageObjectContentInner.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_file", required = true) val imageFile: MessageContentImageFileObjectImageFile,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_url", required = true) val imageUrl: MessageContentImageUrlObjectImageUrl,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("text", required = true) val text: MessageContentTextObjectText,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("refusal", required = true) val refusal: kotlin.String
) {

    /**
    * Always `image_file`.
    * Values: image_file,image_url,text,refusal
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_file("image_file"),
        image_url("image_url"),
        text("text"),
        refusal("refusal");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageObjectContentInner'")
            }
        }
    }

}

