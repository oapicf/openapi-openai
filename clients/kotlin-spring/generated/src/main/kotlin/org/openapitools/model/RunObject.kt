package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssistantObjectToolsInner
import org.openapitools.model.AssistantsApiResponseFormatOption
import org.openapitools.model.AssistantsApiToolChoiceOption
import org.openapitools.model.RunCompletionUsage
import org.openapitools.model.RunObjectIncompleteDetails
import org.openapitools.model.RunObjectLastError
import org.openapitools.model.RunObjectRequiredAction
import org.openapitools.model.TruncationObject
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
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.run`.
 * @param createdAt The Unix timestamp (in seconds) for when the run was created.
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
 * @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
 * @param requiredAction 
 * @param lastError 
 * @param expiresAt The Unix timestamp (in seconds) for when the run will expire.
 * @param startedAt The Unix timestamp (in seconds) for when the run was started.
 * @param cancelledAt The Unix timestamp (in seconds) for when the run was cancelled.
 * @param failedAt The Unix timestamp (in seconds) for when the run failed.
 * @param completedAt The Unix timestamp (in seconds) for when the run was completed.
 * @param incompleteDetails 
 * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param usage 
 * @param maxPromptTokens The maximum number of prompt tokens specified to have been used over the course of the run. 
 * @param maxCompletionTokens The maximum number of completion tokens specified to have been used over the course of the run. 
 * @param truncationStrategy 
 * @param toolChoice 
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @param responseFormat 
 * @param temperature The sampling temperature used for this run. If not set, defaults to 1.
 * @param topP The nucleus sampling value used for this run. If not set, defaults to 1.
 */
data class RunObject(

    @Schema(required = true, description = "The identifier, which can be referenced in API endpoints.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "The object type, which is always `thread.run`.")
    @param:JsonProperty("object")
    @get:JsonProperty("object", required = true) val `object`: RunObject.`Object`,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(required = true, description = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.")
    @param:JsonProperty("thread_id")
    @get:JsonProperty("thread_id", required = true) val threadId: kotlin.String,

    @Schema(required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.")
    @param:JsonProperty("assistant_id")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String,

    @Schema(required = true, description = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: RunObject.Status,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("required_action")
    @get:JsonProperty("required_action", required = true) val requiredAction: RunObjectRequiredAction?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("last_error")
    @get:JsonProperty("last_error", required = true) val lastError: RunObjectLastError?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run will expire.")
    @param:JsonProperty("expires_at")
    @get:JsonProperty("expires_at", required = true) val expiresAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was started.")
    @param:JsonProperty("started_at")
    @get:JsonProperty("started_at", required = true) val startedAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was cancelled.")
    @param:JsonProperty("cancelled_at")
    @get:JsonProperty("cancelled_at", required = true) val cancelledAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run failed.")
    @param:JsonProperty("failed_at")
    @get:JsonProperty("failed_at", required = true) val failedAt: kotlin.Int?,

    @Schema(required = true, description = "The Unix timestamp (in seconds) for when the run was completed.")
    @param:JsonProperty("completed_at")
    @get:JsonProperty("completed_at", required = true) val completedAt: kotlin.Int?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("incomplete_details")
    @get:JsonProperty("incomplete_details", required = true) val incompleteDetails: RunObjectIncompleteDetails?,

    @Schema(required = true, description = "The model that the [assistant](/docs/api-reference/assistants) used for this run.")
    @param:JsonProperty("model")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(required = true, description = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.")
    @param:JsonProperty("instructions")
    @get:JsonProperty("instructions", required = true) val instructions: kotlin.String,

    @field:Valid
    @get:Size(max=20)
    @Schema(required = true, description = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.")
    @param:JsonProperty("tools")
    @get:JsonProperty("tools", required = true) val tools: kotlin.collections.List<AssistantObjectToolsInner> = arrayListOf(),

    @field:Valid
    @Schema(required = true, description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata", required = true) val metadata: kotlin.Any?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("usage")
    @get:JsonProperty("usage", required = true) val usage: RunCompletionUsage?,

    @get:Min(value=256)
    @Schema(required = true, description = "The maximum number of prompt tokens specified to have been used over the course of the run. ")
    @param:JsonProperty("max_prompt_tokens")
    @get:JsonProperty("max_prompt_tokens", required = true) val maxPromptTokens: kotlin.Int?,

    @get:Min(value=256)
    @Schema(required = true, description = "The maximum number of completion tokens specified to have been used over the course of the run. ")
    @param:JsonProperty("max_completion_tokens")
    @get:JsonProperty("max_completion_tokens", required = true) val maxCompletionTokens: kotlin.Int?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("truncation_strategy")
    @get:JsonProperty("truncation_strategy", required = true) val truncationStrategy: TruncationObject,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("tool_choice")
    @get:JsonProperty("tool_choice", required = true) val toolChoice: AssistantsApiToolChoiceOption,

    @Schema(required = true, description = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
    @param:JsonProperty("parallel_tool_calls")
    @get:JsonProperty("parallel_tool_calls", required = true) val parallelToolCalls: kotlin.Boolean = true,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("response_format")
    @get:JsonProperty("response_format", required = true) val responseFormat: AssistantsApiResponseFormatOption,

    @Schema(description = "The sampling temperature used for this run. If not set, defaults to 1.")
    @param:JsonProperty("temperature")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = null,

    @Schema(description = "The nucleus sampling value used for this run. If not set, defaults to 1.")
    @param:JsonProperty("top_p")
    @get:JsonProperty("top_p") val topP: java.math.BigDecimal? = null
) {

    /**
    * The object type, which is always `thread.run`.
    * Values: threadPeriodRun
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        threadPeriodRun("thread.run");

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
    * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
    * Values: queued,in_progress,requires_action,cancelling,cancelled,failed,completed,incomplete,expired
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        queued("queued"),
        in_progress("in_progress"),
        requires_action("requires_action"),
        cancelling("cancelling"),
        cancelled("cancelled"),
        failed("failed"),
        completed("completed"),
        incomplete("incomplete"),
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

