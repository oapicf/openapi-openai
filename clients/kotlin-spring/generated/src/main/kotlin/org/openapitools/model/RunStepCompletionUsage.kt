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
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 * @param completionTokens Number of completion tokens used over the course of the run step.
 * @param promptTokens Number of prompt tokens used over the course of the run step.
 * @param totalTokens Total number of tokens used (prompt + completion).
 */
data class RunStepCompletionUsage(

    @Schema(required = true, description = "Number of completion tokens used over the course of the run step.")
    @param:JsonProperty("completion_tokens")
    @get:JsonProperty("completion_tokens", required = true) val completionTokens: kotlin.Int,

    @Schema(required = true, description = "Number of prompt tokens used over the course of the run step.")
    @param:JsonProperty("prompt_tokens")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(required = true, description = "Total number of tokens used (prompt + completion).")
    @param:JsonProperty("total_tokens")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
) {

}

