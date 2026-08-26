package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchRequestInput(
    /** A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. */
    val customId: kotlin.String? = null,
    /** The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported. */
    val method: kotlin.String? = null,
    /** The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. */
    val url: kotlin.String? = null
)
