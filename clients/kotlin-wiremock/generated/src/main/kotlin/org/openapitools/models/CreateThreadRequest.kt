@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateThreadRequest(
    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<CreateMessageRequest>? = null,

    @field:JsonProperty("tool_resources")
    val toolResources: CreateThreadRequestToolResources? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
