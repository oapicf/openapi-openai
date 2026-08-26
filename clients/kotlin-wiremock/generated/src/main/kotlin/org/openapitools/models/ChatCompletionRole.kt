@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChatCompletionRole {
    @JsonProperty(value = "system") system,
    @JsonProperty(value = "user") user,
    @JsonProperty(value = "assistant") assistant,
    @JsonProperty(value = "tool") tool,
    @JsonProperty(value = "function") function,
}
