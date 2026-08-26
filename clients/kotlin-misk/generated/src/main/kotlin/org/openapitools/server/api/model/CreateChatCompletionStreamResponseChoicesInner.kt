package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionStreamResponseDelta
import org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInnerLogprobs
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionStreamResponseChoicesInner(
    val delta: ChatCompletionStreamResponseDelta,
    /** The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.  */
    val finishReason: kotlin.String,
    /** The index of the choice in the list of choices. */
    val index: kotlin.Int,
    val logprobs: CreateChatCompletionResponseChoicesInnerLogprobs? = null
)
