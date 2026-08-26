package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(required = true, description = "The Upload unique identifier, which can be referenced in API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the Upload was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(required = true, description = "The name of the file to be uploaded.")
    @param:JsonProperty("filename")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(required = true, description = "The intended number of bytes to be uploaded.")
    @param:JsonProperty("bytes")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(required = true, description = "The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.")
    @param:JsonProperty("purpose")
    @get:JsonProperty("purpose", required = true) val purpose: kotlin.String,

    @Schema(required = true, description = "The status of the Upload.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: Upload.Status,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the Upload was created.")
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int,

    @Schema(description = "The object type, which is always \"upload\".")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("object")
    @get:JsonProperty("object") val `object`: Upload.`Object`? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("file")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Status'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

}

