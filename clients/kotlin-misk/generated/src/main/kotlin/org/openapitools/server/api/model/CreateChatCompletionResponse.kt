package org.openapitools.server.api.model

import org.openapitools.server.api.model.CompletionUsage
import org.openapitools.server.api.model.CreateChatCompletionResponseChoicesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionResponse(
    /** A unique identifier for the chat completion. */
    val id: kotlin.String,
    /** A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. */
    val choices: kotlin.collections.List<CreateChatCompletionResponseChoicesInner>,
    /** The Unix timestamp (in seconds) of when the chat completion was created. */
    val created: kotlin.Int,
    /** The model used for the chat completion. */
    val model: kotlin.String,
    /** The object type, which is always &#x60;chat.completion&#x60;. */
    val `object`: kotlin.String,
    /** The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. */
    val serviceTier: kotlin.String? = null,
    /** This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  */
    val systemFingerprint: kotlin.String? = null,
    val usage: CompletionUsage? = null
)
