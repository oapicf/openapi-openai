@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionStreamOptions(
    @field:JsonProperty("include_usage")
    val includeUsage: kotlin.Boolean? = null,

)
