@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ChatCompletionRequestMessageContentPartImageImageUrl(
    @field:JsonProperty("url")
    val url: java.net.URI,

    @field:JsonProperty("detail")
    val detail: kotlin.String? = Detail.auto,

)
