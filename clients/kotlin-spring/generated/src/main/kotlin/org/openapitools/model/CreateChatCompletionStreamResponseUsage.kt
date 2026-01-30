package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 * @param completionTokens Number of tokens in the generated completion.
 * @param promptTokens Number of tokens in the prompt.
 * @param totalTokens Total number of tokens used in the request (prompt + completion).
 */
data class CreateChatCompletionStreamResponseUsage(

    @Schema(example = "null", required = true, description = "Number of tokens in the generated completion.")
    @get:JsonProperty("completion_tokens", required = true) val completionTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "Number of tokens in the prompt.")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "Total number of tokens used in the request (prompt + completion).")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
) {

}

