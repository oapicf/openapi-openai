package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageCompletionsResult(
    val `object`: kotlin.String,
    /** The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. */
    val inputTokens: kotlin.Int,
    /** The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. */
    val outputTokens: kotlin.Int,
    /** The count of requests made to the model. */
    val numModelRequests: kotlin.Int,
    /** The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. */
    val inputCachedTokens: kotlin.Int? = null,
    /** The aggregated number of audio input tokens used, including cached tokens. */
    val inputAudioTokens: kotlin.Int? = null,
    /** The aggregated number of audio output tokens used. */
    val outputAudioTokens: kotlin.Int? = null,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. */
    val projectId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. */
    val userId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. */
    val apiKeyId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. */
    val model: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not. */
    val batch: kotlin.Boolean? = null
)
