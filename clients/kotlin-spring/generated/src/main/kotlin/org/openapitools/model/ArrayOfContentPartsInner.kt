package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageContentImageFileObject
import org.openapitools.model.MessageContentImageFileObjectImageFile
import org.openapitools.model.MessageContentImageUrlObject
import org.openapitools.model.MessageContentImageUrlObjectImageUrl
import org.openapitools.model.MessageRequestContentTextObject
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
 * @param text Text content to be sent to the model
 */
data class ArrayOfContentPartsInner(

    @Schema(example = "null", required = true, description = "Always `image_file`.")
    @get:JsonProperty("type", required = true) val type: ArrayOfContentPartsInner.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_file", required = true) val imageFile: MessageContentImageFileObjectImageFile,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("image_url", required = true) val imageUrl: MessageContentImageUrlObjectImageUrl,

    @Schema(example = "null", required = true, description = "Text content to be sent to the model")
    @get:JsonProperty("text", required = true) val text: kotlin.String
) {

    /**
    * Always `image_file`.
    * Values: image_file,image_url,text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        image_file("image_file"),
        image_url("image_url"),
        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ArrayOfContentPartsInner'")
            }
        }
    }

}

