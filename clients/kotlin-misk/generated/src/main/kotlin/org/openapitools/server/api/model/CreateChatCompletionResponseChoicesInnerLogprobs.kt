package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionTokenLogprob
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionResponseChoicesInnerLogprobs(
    /** A list of message content tokens with log probability information. */
    val content: kotlin.collections.List<ChatCompletionTokenLogprob>,
    /** A list of message refusal tokens with log probability information. */
    val refusal: kotlin.collections.List<ChatCompletionTokenLogprob>
)
