package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssistantObjectToolsInner
import org.openapitools.model.AssistantsApiResponseFormatOption
import org.openapitools.model.AssistantsApiToolChoiceOption
import org.openapitools.model.CreateMessageRequest
import org.openapitools.model.CreateRunRequestModel
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
 * 
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @param model 
 * @param instructions Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @param additionalInstructions Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
 * @param additionalMessages Adds additional messages to the thread before creating the run.
 * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @param truncationStrategy 
 * @param toolChoice 
 * @param responseFormat 
 */
data class CreateRunRequest(

    @Schema(example = "null", required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("model") val model: CreateRunRequestModel? = null,

    @Schema(example = "null", description = "Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @Schema(example = "null", description = "Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.")
    @get:JsonProperty("additional_instructions") val additionalInstructions: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Adds additional messages to the thread before creating the run.")
    @get:JsonProperty("additional_messages") val additionalMessages: kotlin.collections.List<CreateMessageRequest>? = null,

    @field:Valid
    @get:Size(max=20)
    @Schema(example = "null", description = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<AssistantObjectToolsInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null,

    @get:DecimalMin("0")
    @get:DecimalMax("2")
    @Schema(example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @Schema(example = "null", description = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
    @get:JsonProperty("stream") val stream: kotlin.Boolean? = null,

    @get:Min(256)
    @Schema(example = "null", description = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ")
    @get:JsonProperty("max_prompt_tokens") val maxPromptTokens: kotlin.Int? = null,

    @get:Min(256)
    @Schema(example = "null", description = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. ")
    @get:JsonProperty("max_completion_tokens") val maxCompletionTokens: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("truncation_strategy") val truncationStrategy: TruncationObject? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tool_choice") val toolChoice: AssistantsApiToolChoiceOption? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("response_format") val responseFormat: AssistantsApiResponseFormatOption? = null
) {

}

