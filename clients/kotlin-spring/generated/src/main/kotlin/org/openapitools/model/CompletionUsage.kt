package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CompletionUsageCompletionTokensDetails
import org.openapitools.model.CompletionUsagePromptTokensDetails
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
 * Usage statistics for the completion request.
 * @param completionTokens Number of tokens in the generated completion.
 * @param promptTokens Number of tokens in the prompt.
 * @param totalTokens Total number of tokens used in the request (prompt + completion).
 * @param completionTokensDetails 
 * @param promptTokensDetails 
 */
data class CompletionUsage(

    @Schema(required = true, description = "Number of tokens in the generated completion.")
    @param:JsonProperty("completion_tokens", required = true)
    @get:JsonProperty("completion_tokens", required = true) val completionTokens: kotlin.Int,

    @Schema(required = true, description = "Number of tokens in the prompt.")
    @param:JsonProperty("prompt_tokens", required = true)
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(required = true, description = "Total number of tokens used in the request (prompt + completion).")
    @param:JsonProperty("total_tokens", required = true)
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("completion_tokens_details")
    @get:JsonProperty("completion_tokens_details") val completionTokensDetails: CompletionUsageCompletionTokensDetails? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("prompt_tokens_details")
    @get:JsonProperty("prompt_tokens_details") val promptTokensDetails: CompletionUsagePromptTokensDetails? = null
) {

}

