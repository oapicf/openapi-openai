package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `batch`.")
    @get:JsonProperty("object", required = true) val `object`: Batch.`Object`,

    @Schema(example = "null", required = true, description = "The OpenAI API endpoint used by the batch.")
    @get:JsonProperty("endpoint", required = true) val endpoint: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the input file for the batch.")
    @get:JsonProperty("input_file_id", required = true) val inputFileId: kotlin.String,

    @Schema(example = "null", required = true, description = "The time frame within which the batch should be processed.")
    @get:JsonProperty("completion_window", required = true) val completionWindow: kotlin.String,

    @Schema(example = "null", required = true, description = "The current status of the batch.")
    @get:JsonProperty("status", required = true) val status: Batch.Status,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the batch was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("errors") val errors: BatchErrors? = null,

    @Schema(example = "null", description = "The ID of the file containing the outputs of successfully executed requests.")
    @get:JsonProperty("output_file_id") val outputFileId: kotlin.String? = null,

    @Schema(example = "null", description = "The ID of the file containing the outputs of requests with errors.")
    @get:JsonProperty("error_file_id") val errorFileId: kotlin.String? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch started processing.")
    @get:JsonProperty("in_progress_at") val inProgressAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch will expire.")
    @get:JsonProperty("expires_at") val expiresAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch started finalizing.")
    @get:JsonProperty("finalizing_at") val finalizingAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch was completed.")
    @get:JsonProperty("completed_at") val completedAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch failed.")
    @get:JsonProperty("failed_at") val failedAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch expired.")
    @get:JsonProperty("expired_at") val expiredAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch started cancelling.")
    @get:JsonProperty("cancelling_at") val cancellingAt: kotlin.Int? = null,

    @Schema(example = "null", description = "The Unix timestamp (in seconds) for when the batch was cancelled.")
    @get:JsonProperty("cancelled_at") val cancelledAt: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request_counts") val requestCounts: BatchRequestCounts? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Batch'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Batch'")
            }
        }
    }

}

