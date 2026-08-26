@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaObjectDelta(
    @field:JsonProperty("role")
    val role: kotlin.String? = null,

    @field:JsonProperty("content")
    val content: kotlin.collections.List<MessageDeltaObjectDeltaContentInner>? = null,

)
