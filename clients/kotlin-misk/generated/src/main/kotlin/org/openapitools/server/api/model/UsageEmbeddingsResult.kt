package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsageEmbeddingsResult(
    val `object`: kotlin.String,
    /** The aggregated number of input tokens used. */
    val inputTokens: kotlin.Int,
    /** The count of requests made to the model. */
    val numModelRequests: kotlin.Int,
    /** When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result. */
    val projectId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result. */
    val userId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result. */
    val apiKeyId: kotlin.String? = null,
    /** When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result. */
    val model: kotlin.String? = null
)
