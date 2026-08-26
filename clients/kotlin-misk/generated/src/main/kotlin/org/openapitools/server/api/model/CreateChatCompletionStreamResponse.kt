package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateChatCompletionStreamResponseChoicesInner
import org.openapitools.server.api.model.CreateChatCompletionStreamResponseUsage
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionStreamResponse(
    /** A unique identifier for the chat completion. Each chunk has the same ID. */
    val id: kotlin.String,
    /** A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;.  */
    val choices: kotlin.collections.List<CreateChatCompletionStreamResponseChoicesInner>,
    /** The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. */
    val created: kotlin.Int,
    /** The model to generate the completion. */
    val model: kotlin.String,
    /** The object type, which is always &#x60;chat.completion.chunk&#x60;. */
    val `object`: kotlin.String,
    /** The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. */
    val serviceTier: kotlin.String? = null,
    /** This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  */
    val systemFingerprint: kotlin.String? = null,
    val usage: CreateChatCompletionStreamResponseUsage? = null
)
