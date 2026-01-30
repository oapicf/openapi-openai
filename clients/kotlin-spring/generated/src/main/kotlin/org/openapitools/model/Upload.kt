package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OpenAIFile
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
 * The Upload object can accept byte chunks in the form of Parts. 
 * @param id The Upload unique identifier, which can be referenced in API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the Upload was created.
 * @param filename The name of the file to be uploaded.
 * @param bytes The intended number of bytes to be uploaded.
 * @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
 * @param status The status of the Upload.
 * @param expiresAt The Unix timestamp (in seconds) for when the Upload was created.
 * @param &#x60;object&#x60; The object type, which is always \"upload\".
 * @param file 
 */
data class Upload(

    @Schema(example = "null", required = true, description = "The Upload unique identifier, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the Upload was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The name of the file to be uploaded.")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(example = "null", required = true, description = "The intended number of bytes to be uploaded.")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(example = "null", required = true, description = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.")
    @get:JsonProperty("purpose", required = true) val purpose: kotlin.String,

    @Schema(example = "null", required = true, description = "The status of the Upload.")
    @get:JsonProperty("status", required = true) val status: Upload.Status,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the Upload was created.")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int,

    @Schema(example = "null", description = "The object type, which is always \"upload\".")
    @get:JsonProperty("object") val `object`: Upload.`Object`? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("file") val file: OpenAIFile? = null
) {

    /**
    * The status of the Upload.
    * Values: pending,completed,cancelled,expired
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        pending("pending"),
        completed("completed"),
        cancelled("cancelled"),
        expired("expired");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Upload'")
            }
        }
    }

    /**
    * The object type, which is always \"upload\".
    * Values: upload
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        upload("upload");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Upload'")
            }
        }
    }

}

