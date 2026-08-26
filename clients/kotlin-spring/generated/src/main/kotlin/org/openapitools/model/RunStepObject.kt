package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunStepCompletionUsage
import org.openapitools.model.RunStepObjectLastError
import org.openapitools.model.RunStepObjectStepDetails
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
 * Represents a step in execution of a run. 
 * @param id The identifier of the run step, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.run.step`.
 * @param createdAt The Unix timestamp (in seconds) for when the run step was created.
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
 * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
 * @param type The type of run step, which can be either `message_creation` or `tool_calls`.
 * @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
 * @param stepDetails 
 * @param lastError 
 * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
 * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled.
 * @param failedAt The Unix timestamp (in seconds) for when the run step failed.
 * @param completedAt The Unix timestamp (in seconds) for when the run step completed.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param usage 
 */
data class RunStepObject(

    @Schema(required = true, description = "The identifier of the run step, which can be referenced in API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `thread.run.step`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: RunStepObject.`Object`,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run step was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.")
    @param:JsonProperty("assistant_id")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String,

    @Schema(required = true, description = "The ID of the [thread](/docs/api-reference/threads) that was run.")
    @param:JsonProperty("thread_id")
    @get:JsonProperty("thread_id", required = true) val threadId: kotlin.String,

    @Schema(required = true, description = "The ID of the [run](/docs/api-reference/runs) that this run step is a part of.")
    @param:JsonProperty("run_id")
    @get:JsonProperty("run_id", required = true) val runId: kotlin.String,

    @Schema(required = true, description = "The type of run step, which can be either `message_creation` or `tool_calls`.")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: RunStepObject.Type,

    @Schema(required = true, description = "The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: RunStepObject.Status,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("step_details")
    @get:JsonProperty("step_details", required = true) val stepDetails: RunStepObjectStepDetails,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("last_error")
    @get:JsonProperty("last_error", required = true) val lastError: RunStepObjectLastError?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.")
    @param:JsonProperty("expired_at")
    @get:JsonProperty("expired_at", required = true) val expiredAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run step was cancelled.")
    @param:JsonProperty("cancelled_at")
    @get:JsonProperty("cancelled_at", required = true) val cancelledAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run step failed.")
    @param:JsonProperty("failed_at")
    @get:JsonProperty("failed_at", required = true) val failedAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run step completed.")
    @param:JsonProperty("completed_at")
    @get:JsonProperty("completed_at", required = true) val completedAt: kotlin.Int?,

    @field:Valid
    @Schema(required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("usage")
    @get:JsonProperty("usage", required = true) val usage: RunStepCompletionUsage?
) {

    /**
    * The object type, which is always `thread.run.step`.
    * Values: threadPeriodRunPeriodStep
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        threadPeriodRunPeriodStep("thread.run.step");

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
    * The type of run step, which can be either `message_creation` or `tool_calls`.
    * Values: message_creation,tool_calls
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        message_creation("message_creation"),
        tool_calls("tool_calls");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

    /**
    * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    * Values: in_progress,cancelled,failed,completed,expired
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        in_progress("in_progress"),
        cancelled("cancelled"),
        failed("failed"),
        completed("completed"),
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

}

