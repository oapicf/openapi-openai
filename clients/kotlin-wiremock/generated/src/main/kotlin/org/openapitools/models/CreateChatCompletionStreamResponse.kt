@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateChatCompletionStreamResponse(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("choices")
    val choices: kotlin.collections.List<CreateChatCompletionStreamResponseChoicesInner>,

    @field:JsonProperty("created")
    val created: kotlin.Int,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("service_tier")
    val serviceTier: kotlin.String? = null,

    @field:JsonProperty("system_fingerprint")
    val systemFingerprint: kotlin.String? = null,

    @field:JsonProperty("usage")
    val usage: CreateChatCompletionStreamResponseUsage? = null,

)
