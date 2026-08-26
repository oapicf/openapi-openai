package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateCompletionResponseChoicesInnerLogprobs
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateCompletionResponseChoicesInner(
    /** The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.  */
    val finishReason: kotlin.String,
    val index: kotlin.Int,
    val logprobs: CreateCompletionResponseChoicesInnerLogprobs,
    val text: kotlin.String
)
