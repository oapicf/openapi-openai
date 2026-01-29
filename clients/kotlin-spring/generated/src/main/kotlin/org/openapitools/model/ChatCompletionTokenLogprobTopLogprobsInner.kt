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
 * 
 * @param token The token.
 * @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 */
data class ChatCompletionTokenLogprobTopLogprobsInner(

    @Schema(example = "null", required = true, description = "The token.")
    @get:JsonProperty("token", required = true) val token: kotlin.String,

    @Schema(example = "null", required = true, description = "The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.")
    @get:JsonProperty("logprob", required = true) val logprob: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.")
    @get:JsonProperty("bytes", required = true) val bytes: kotlin.collections.List<kotlin.Int>?
) {

}

