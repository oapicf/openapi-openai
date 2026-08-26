package org.openapitools.server.api.model

import org.openapitools.server.api.model.CompletionUsage
import org.openapitools.server.api.model.CreateCompletionResponseChoicesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateCompletionResponse(
    /** A unique identifier for the completion. */
    val id: kotlin.String,
    /** The list of completion choices the model generated for the input prompt. */
    val choices: kotlin.collections.List<CreateCompletionResponseChoicesInner>,
    /** The Unix timestamp (in seconds) of when the completion was created. */
    val created: kotlin.Int,
    /** The model used for completion. */
    val model: kotlin.String,
    /** The object type, which is always \&quot;text_completion\&quot; */
    val `object`: kotlin.String,
    /** This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  */
    val systemFingerprint: kotlin.String? = null,
    val usage: CompletionUsage? = null
)
