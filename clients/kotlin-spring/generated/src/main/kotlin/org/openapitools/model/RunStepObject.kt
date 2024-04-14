package org.openapitools.model

import java.util.Objects
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
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param usage 
 */
data class RunStepObject(

    @Schema(example = "null", required = true, description = "The identifier of the run step, which can be referenced in API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always `thread.run.step`.")
    @get:JsonProperty("object", required = true) val `object`: RunStepObject.`Object`,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the run step was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the [thread](/docs/api-reference/threads) that was run.")
    @get:JsonProperty("thread_id", required = true) val threadId: kotlin.String,

    @Schema(example = "null", required = true, description = "The ID of the [run](/docs/api-reference/runs) that this run step is a part of.")
    @get:JsonProperty("run_id", required = true) val runId: kotlin.String,

    @Schema(example = "null", required = true, description = "The type of run step, which can be either `message_creation` or `tool_calls`.")
    @get:JsonProperty("type", required = true) val type: RunStepObject.Type,

    @Schema(example = "null", required = true, description = "The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.")
    @get:JsonProperty("status", required = true) val status: RunStepObject.Status,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("step_details", required = true) val stepDetails: RunStepObjectStepDetails,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("last_error", required = true) val lastError: RunStepObjectLastError?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.")
    @get:JsonProperty("expired_at", required = true) val expiredAt: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the run step was cancelled.")
    @get:JsonProperty("cancelled_at", required = true) val cancelledAt: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the run step failed.")
    @get:JsonProperty("failed_at", required = true) val failedAt: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the run step completed.")
    @get:JsonProperty("completed_at", required = true) val completedAt: kotlin.Int?,

    @field:Valid
    @Schema(example = "null", required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("usage", required = true) val usage: RunStepCompletionUsage?
) {

    /**
    * The object type, which is always `thread.run.step`.
    * Values: threadPeriodRunPeriodStep
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("thread.run.step") threadPeriodRunPeriodStep("thread.run.step")
    }

    /**
    * The type of run step, which can be either `message_creation` or `tool_calls`.
    * Values: message_creation,tool_calls
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("message_creation") message_creation("message_creation"),
        @JsonProperty("tool_calls") tool_calls("tool_calls")
    }

    /**
    * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    * Values: in_progress,cancelled,failed,completed,expired
    */
    enum class Status(val value: kotlin.String) {

        @JsonProperty("in_progress") in_progress("in_progress"),
        @JsonProperty("cancelled") cancelled("cancelled"),
        @JsonProperty("failed") failed("failed"),
        @JsonProperty("completed") completed("completed"),
        @JsonProperty("expired") expired("expired")
    }

}

