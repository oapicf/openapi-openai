package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BatchErrors
import org.openapitools.model.BatchRequestCounts
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
 * @param id 
 * @param &#x60;object&#x60; The object type, which is always `batch`.
 * @param endpoint The OpenAI API endpoint used by the batch.
 * @param inputFileId The ID of the input file for the batch.
 * @param completionWindow The time frame within which the batch should be processed.
 * @param status The current status of the batch.
 * @param createdAt The Unix timestamp (in seconds) for when the batch was created.
 * @param errors 
 * @param outputFileId The ID of the file containing the outputs of successfully executed requests.
 * @param errorFileId The ID of the file containing the outputs of requests with errors.
 * @param inProgressAt The Unix timestamp (in seconds) for when the batch started processing.
 * @param expiresAt The Unix timestamp (in seconds) for when the batch will expire.
 * @param finalizingAt The Unix timestamp (in seconds) for when the batch started finalizing.
 * @param completedAt The Unix timestamp (in seconds) for when the batch was completed.
 * @param failedAt The Unix timestamp (in seconds) for when the batch failed.
 * @param expiredAt The Unix timestamp (in seconds) for when the batch expired.
 * @param cancellingAt The Unix timestamp (in seconds) for when the batch started cancelling.
 * @param cancelledAt The Unix timestamp (in seconds) for when the batch was cancelled.
 * @param requestCounts 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 */
data class Batch(

    @Schema(required = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `batch`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: Batch.`Object`,

    @Schema(required = true, description = "The OpenAI API endpoint used by the batch.")
    @param:JsonProperty("endpoint")
    @get:JsonProperty("endpoint", required = true) val endpoint: kotlin.String,

    @Schema(required = true, description = "The ID of the input file for the batch.")
    @param:JsonProperty("input_file_id")
    @get:JsonProperty("input_file_id", required = true) val inputFileId: kotlin.String,

    @Schema(required = true, description = "The time frame within which the batch should be processed.")
    @param:JsonProperty("completion_window")
    @get:JsonProperty("completion_window", required = true) val completionWindow: kotlin.String,

    @Schema(required = true, description = "The current status of the batch.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: Batch.Status,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the batch was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: BatchErrors? = null,

    @Schema(description = "The ID of the file containing the outputs of successfully executed requests.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("output_file_id")
    @get:JsonProperty("output_file_id") val outputFileId: kotlin.String? = null,

    @Schema(description = "The ID of the file containing the outputs of requests with errors.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("error_file_id")
    @get:JsonProperty("error_file_id") val errorFileId: kotlin.String? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch started processing.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("in_progress_at")
    @get:JsonProperty("in_progress_at") val inProgressAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch will expire.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at") val expiresAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch started finalizing.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("finalizing_at")
    @get:JsonProperty("finalizing_at") val finalizingAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch was completed.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("completed_at")
    @get:JsonProperty("completed_at") val completedAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch failed.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("failed_at")
    @get:JsonProperty("failed_at") val failedAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch expired.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("expired_at")
    @get:JsonProperty("expired_at") val expiredAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch started cancelling.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cancelling_at")
    @get:JsonProperty("cancelling_at") val cancellingAt: kotlin.Int? = null,

    @Schema(description = "The Unix timestamp (in seconds) for when the batch was cancelled.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cancelled_at")
    @get:JsonProperty("cancelled_at") val cancelledAt: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("request_counts")
    @get:JsonProperty("request_counts") val requestCounts: BatchRequestCounts? = null,

    @field:Valid
    @Schema(description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null
) {

    /**
    * The object type, which is always `batch`.
    * Values: batch
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        batch("batch");

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
    * The current status of the batch.
    * Values: validating,failed,in_progress,finalizing,completed,expired,cancelling,cancelled
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        validating("validating"),
        failed("failed"),
        in_progress("in_progress"),
        finalizing("finalizing"),
        completed("completed"),
        expired("expired"),
        cancelling("cancelling"),
        cancelled("cancelled");

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

