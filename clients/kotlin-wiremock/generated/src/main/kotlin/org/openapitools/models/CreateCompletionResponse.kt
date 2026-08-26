@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateCompletionResponse(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("choices")
    val choices: kotlin.collections.List<CreateCompletionResponseChoicesInner>,

    @field:JsonProperty("created")
    val created: kotlin.Int,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("system_fingerprint")
    val systemFingerprint: kotlin.String? = null,

    @field:JsonProperty("usage")
    val usage: CompletionUsage? = null,

)
