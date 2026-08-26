@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionMessageToolCallChunkFunction(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("arguments")
    val arguments: kotlin.String? = null,

)
