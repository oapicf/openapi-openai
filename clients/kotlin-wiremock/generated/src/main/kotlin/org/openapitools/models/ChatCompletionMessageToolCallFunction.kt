@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionMessageToolCallFunction(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("arguments")
    val arguments: kotlin.String,

)
