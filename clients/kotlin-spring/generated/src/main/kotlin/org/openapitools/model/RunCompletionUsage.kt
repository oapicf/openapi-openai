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
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 * @param completionTokens Number of completion tokens used over the course of the run.
 * @param promptTokens Number of prompt tokens used over the course of the run.
 * @param totalTokens Total number of tokens used (prompt + completion).
 */
data class RunCompletionUsage(

    @Schema(example = "null", required = true, description = "Number of completion tokens used over the course of the run.")
    @get:JsonProperty("completion_tokens", required = true) val completionTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "Number of prompt tokens used over the course of the run.")
    @get:JsonProperty("prompt_tokens", required = true) val promptTokens: kotlin.Int,

    @Schema(example = "null", required = true, description = "Total number of tokens used (prompt + completion).")
    @get:JsonProperty("total_tokens", required = true) val totalTokens: kotlin.Int
    ) {

}

