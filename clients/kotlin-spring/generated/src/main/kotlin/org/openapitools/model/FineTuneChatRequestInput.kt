package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ChatCompletionFunctions
import org.openapitools.model.ChatCompletionTool
import org.openapitools.model.FineTuneChatRequestInputMessagesInner
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
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 * @param messages 
 * @param tools A list of tools the model may generate JSON inputs for.
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @param functions A list of functions the model may generate JSON inputs for.
 */
data class FineTuneChatRequestInput(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "")
    @get:JsonProperty("messages") val messages: kotlin.collections.List<FineTuneChatRequestInputMessagesInner>? = null,

    @field:Valid
    @Schema(example = "null", description = "A list of tools the model may generate JSON inputs for.")
    @get:JsonProperty("tools") val tools: kotlin.collections.List<ChatCompletionTool>? = null,

    @Schema(example = "null", description = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
    @get:JsonProperty("parallel_tool_calls") val parallelToolCalls: kotlin.Boolean? = true,

    @field:Valid
    @get:Size(min=1,max=128) 
    @Schema(example = "null", description = "A list of functions the model may generate JSON inputs for.")
    @Deprecated(message = "")
    @get:JsonProperty("functions") val functions: kotlin.collections.List<ChatCompletionFunctions>? = null
) {

}

