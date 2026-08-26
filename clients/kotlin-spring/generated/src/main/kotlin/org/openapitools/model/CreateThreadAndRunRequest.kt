package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssistantsApiResponseFormatOption
import org.openapitools.model.AssistantsApiToolChoiceOption
import org.openapitools.model.CreateRunRequestModel
import org.openapitools.model.CreateThreadAndRunRequestToolResources
import org.openapitools.model.CreateThreadAndRunRequestToolsInner
import org.openapitools.model.CreateThreadRequest
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
 * @param thread 
 * @param model 
 * @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @param toolResources 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @param truncationStrategy 
 * @param toolChoice 
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @param responseFormat 
 */
data class CreateThreadAndRunRequest(

    @Schema(required = true, description = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
    @param:JsonProperty("assistant_id")
    @get:JsonProperty("assistant_id", required = true) val assistantId: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("thread")
    @get:JsonProperty("thread") val thread: CreateThreadRequest? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("model")
    @get:JsonProperty("model") val model: CreateRunRequestModel? = null,

    @Schema(description = "Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.")
    @param:JsonProperty("instructions")
    @get:JsonProperty("instructions") val instructions: kotlin.String? = null,

    @field:Valid
    @get:Size(max=20)
    @Schema(description = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
    @param:JsonProperty("tools")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<CreateThreadAndRunRequestToolsInner>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tool_resources")
    @get:JsonProperty("tool_resources") val toolResources: CreateThreadAndRunRequestToolResources? = null,

    @field:Valid
    @Schema(description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
    @param:JsonProperty("metadata")
    @get:JsonProperty("metadata") val metadata: kotlin.Any? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="2")
    @Schema(example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
    @param:JsonProperty("temperature")
    @get:JsonProperty("temperature") val temperature: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
    @param:JsonProperty("top_p")
    @get:JsonProperty("top_p") val topP: java.math.BigDecimal? = java.math.BigDecimal("1"),

    @Schema(description = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
    @param:JsonProperty("stream")
    @get:JsonProperty("stream") val stream: kotlin.Boolean? = null,

    @get:Min(value=256)
    @Schema(description = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
    @param:JsonProperty("max_prompt_tokens")
    @get:JsonProperty("max_prompt_tokens") val maxPromptTokens: kotlin.Int? = null,

    @get:Min(value=256)
    @Schema(description = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
    @param:JsonProperty("max_completion_tokens")
    @get:JsonProperty("max_completion_tokens") val maxCompletionTokens: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("truncation_strategy")
    @get:JsonProperty("truncation_strategy") val truncationStrategy: TruncationObject? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tool_choice")
    @get:JsonProperty("tool_choice") val toolChoice: AssistantsApiToolChoiceOption? = null,

    @Schema(description = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("parallel_tool_calls")
    @get:JsonProperty("parallel_tool_calls") val parallelToolCalls: kotlin.Boolean? = true,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_format")
    @get:JsonProperty("response_format") val responseFormat: AssistantsApiResponseFormatOption? = null
) {

}

