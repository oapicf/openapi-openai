package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ChatCompletionTokenLogprobTopLogprobsInner
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
 * @param token The token.
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 * @param topLogprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
 */
data class ChatCompletionTokenLogprob(

    @Schema(example = "null", required = true, description = "The token.")
    @get:JsonProperty("token", required = true) val token: kotlin.String,

    @Schema(example = "null", required = true, description = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
    @get:JsonProperty("logprob", required = true) val logprob: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.collections.List<kotlin.Int>?,

    @field:Valid
    @Schema(example = "null", required = true, description = "List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.")
    @get:JsonProperty("top_logprobs", required = true) val topLogprobs: kotlin.collections.List<ChatCompletionTokenLogprobTopLogprobsInner>
) {

}

