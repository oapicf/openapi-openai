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
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 * @param id The upload Part unique identifier, which can be referenced in API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the Part was created.
 * @param uploadId The ID of the Upload object that this Part was added to.
 * @param &#x60;object&#x60; The object type, which is always `upload.part`.
 */
data class UploadPart(

    @Schema(example = "null", required = true, description = "The upload Part unique identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the Part was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the Upload object that this Part was added to.")
    @get:JsonProperty("upload_id", required = true) val uploadId: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `upload.part`.")
    @get:JsonProperty("object", required = true) val `object`: UploadPart.`Object`
) {

    /**
    * The object type, which is always `upload.part`.
    * Values: uploadPeriodPart
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        uploadPeriodPart("upload.part");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UploadPart'")
            }
        }
    }

}

