@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentImageUrlObjectImageUrl(
    @field:JsonProperty("url")
    val url: kotlin.String? = null,

    @field:JsonProperty("detail")
    val detail: kotlin.String? = Detail.auto,

)
