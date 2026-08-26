package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionTokenLogprobTopLogprobsInner(
    /** The token. */
    val token: kotlin.String,
    /** The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value &#x60;-9999.0&#x60; is used to signify that the token is very unlikely. */
    val logprob: java.math.BigDecimal,
    /** A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be &#x60;null&#x60; if there is no bytes representation for the token. */
    val bytes: kotlin.collections.List<kotlin.Int>
)
