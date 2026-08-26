package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * The `File` object represents a document that has been uploaded to OpenAI.
 * @param id The file identifier, which can be referenced in the API endpoints.
 * @param bytes The size of the file, in bytes.
 * @param createdAt The Unix timestamp (in seconds) for when the file was created.
 * @param filename The name of the file.
 * @param &#x60;object&#x60; The object type, which is always `file`.
 * @param purpose The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
 * @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @param statusDetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
 */
data class OpenAIFile(

    @Schema(required = true, description = "The file identifier, which can be referenced in the API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The size of the file, in bytes.")
    @param:JsonProperty("bytes")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.Int,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the file was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(required = true, description = "The name of the file.")
    @param:JsonProperty("filename")
    @get:JsonProperty("filename", required = true) val filename: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `file`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: OpenAIFile.`Object`,

    @Schema(required = true, description = "The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.")
    @param:JsonProperty("purpose")
    @get:JsonProperty("purpose", required = true) val purpose: OpenAIFile.Purpose,

    @Schema(required = true, description = "Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: OpenAIFile.Status,

    @Schema(description = "Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.")
    @Deprecated(message = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status_details")
    @get:JsonProperty("status_details") val statusDetails: kotlin.String? = null
) {

    /**
    * The object type, which is always `file`.
    * Values: file
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        file("file");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Object&#x60;'")
            }
        }
    }

    /**
    * The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
    * Values: assistants,assistants_output,batch,batch_output,fineMinusTune,fineMinusTuneMinusResults,vision
    */
    enum class Purpose(@get:JsonValue val value: kotlin.String) {

        assistants("assistants"),
        assistants_output("assistants_output"),
        batch("batch"),
        batch_output("batch_output"),
        fineMinusTune("fine-tune"),
        fineMinusTuneMinusResults("fine-tune-results"),
        vision("vision");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Purpose {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Purpose'")
            }
        }
    }

    /**
    * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
    * Values: uploaded,processed,error
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        uploaded("uploaded"),
        processed("processed"),
        error("error");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Status'")
            }
        }
    }

}

