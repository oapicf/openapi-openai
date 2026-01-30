package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RealtimeResponseUsageInputTokenDetails
import org.openapitools.model.RealtimeResponseUsageOutputTokenDetails
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
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 * @param totalTokens The total number of tokens in the Response including input and output  text and audio tokens. 
 * @param inputTokens The number of input tokens used in the Response, including text and  audio tokens. 
 * @param outputTokens The number of output tokens sent in the Response, including text and  audio tokens. 
 * @param inputTokenDetails 
 * @param outputTokenDetails 
 */
data class RealtimeResponseUsage(

    @Schema(example = "null", description = "The total number of tokens in the Response including input and output  text and audio tokens. ")
    @get:JsonProperty("total_tokens") val totalTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of input tokens used in the Response, including text and  audio tokens. ")
    @get:JsonProperty("input_tokens") val inputTokens: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of output tokens sent in the Response, including text and  audio tokens. ")
    @get:JsonProperty("output_tokens") val outputTokens: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("input_token_details") val inputTokenDetails: RealtimeResponseUsageInputTokenDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("output_token_details") val outputTokenDetails: RealtimeResponseUsageOutputTokenDetails? = null
) {

}

