@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestFunctionMessage(
    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("content")
    val content: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
