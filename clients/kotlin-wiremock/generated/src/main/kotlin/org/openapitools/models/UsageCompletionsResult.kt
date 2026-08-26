@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageCompletionsResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("input_tokens")
    val inputTokens: kotlin.Int,

    @field:JsonProperty("output_tokens")
    val outputTokens: kotlin.Int,

    @field:JsonProperty("num_model_requests")
    val numModelRequests: kotlin.Int,

    @field:JsonProperty("input_cached_tokens")
    val inputCachedTokens: kotlin.Int? = null,

    @field:JsonProperty("input_audio_tokens")
    val inputAudioTokens: kotlin.Int? = null,

    @field:JsonProperty("output_audio_tokens")
    val outputAudioTokens: kotlin.Int? = null,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    @field:JsonProperty("api_key_id")
    val apiKeyId: kotlin.String? = null,

    @field:JsonProperty("model")
    val model: kotlin.String? = null,

    @field:JsonProperty("batch")
    val batch: kotlin.Boolean? = null,

)
