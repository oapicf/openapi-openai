package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageDeltaContentImageFileObjectImageFile
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
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param index The index of the content part in the message.
 * @param type Always `image_file`.
 * @param imageFile 
 */
data class MessageDeltaContentImageFileObject(

    @Schema(example = "null", required = true, description = "The index of the content part in the message.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @Schema(example = "null", required = true, description = "Always `image_file`.")
    @get:JsonProperty("type", required = true) val type: MessageDeltaContentImageFileObject.Type,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image_file") val imageFile: MessageDeltaContentImageFileObjectImageFile? = null
) {

    /**
    * Always `image_file`.
    * Values: image_file
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("image_file") image_file("image_file")
    }

}

