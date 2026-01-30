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
 * @param filename The name of the file to upload. 
 * @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
 * @param bytes The number of bytes in the file you are uploading. 
 * @param mimeType The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
 */
data class CreateUploadRequest(

    @Schema(example = "null", required = true, description = "The name of the file to upload. ")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(example = "null", required = true, description = "The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). ")
    @get:JsonProperty("purpose", required = true) val purpose: CreateUploadRequest.Purpose,

    @Schema(example = "null", required = true, description = "The number of bytes in the file you are uploading. ")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. ")
    @get:JsonProperty("mime_type", required = true) val mimeType: kotlin.String
) {

    /**
    * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
    * Values: assistants,batch,fineMinusTune,vision
    */
    enum class Purpose(@get:JsonValue val value: kotlin.String) {

        assistants("assistants"),
        batch("batch"),
        fineMinusTune("fine-tune"),
        vision("vision");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Purpose {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CreateUploadRequest'")
            }
        }
    }

}

