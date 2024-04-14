package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ChatCompletionResponseMessage
import org.openapitools.model.CreateChatCompletionResponseChoicesInnerLogprobs
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
 * @param finishReason The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @param index The index of the choice in the list of choices.
 * @param message 
 * @param logprobs 
 */
data class CreateChatCompletionResponseChoicesInner(

    @Schema(example = "null", required = true, description = "The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. ")
    @get:JsonProperty("finish_reason", required = true) val finishReason: CreateChatCompletionResponseChoicesInner.FinishReason,

    @Schema(example = "null", required = true, description = "The index of the choice in the list of choices.")
    @get:JsonProperty("index", required = true) val index: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message", required = true) val message: ChatCompletionResponseMessage,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("logprobs", required = true) val logprobs: CreateChatCompletionResponseChoicesInnerLogprobs?
) {

    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
    * Values: stop,length,tool_calls,content_filter,function_call
    */
    enum class FinishReason(val value: kotlin.String) {

        @JsonProperty("stop") stop("stop"),
        @JsonProperty("length") length("length"),
        @JsonProperty("tool_calls") tool_calls("tool_calls"),
        @JsonProperty("content_filter") content_filter("content_filter"),
        @JsonProperty("function_call") function_call("function_call")
    }

}

