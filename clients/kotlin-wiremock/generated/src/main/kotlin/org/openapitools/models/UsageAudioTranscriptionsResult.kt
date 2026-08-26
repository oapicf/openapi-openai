@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageAudioTranscriptionsResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("seconds")
    val seconds: kotlin.Int,

    @field:JsonProperty("num_model_requests")
    val numModelRequests: kotlin.Int,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    @field:JsonProperty("api_key_id")
    val apiKeyId: kotlin.String? = null,

    @field:JsonProperty("model")
    val model: kotlin.String? = null,

)
