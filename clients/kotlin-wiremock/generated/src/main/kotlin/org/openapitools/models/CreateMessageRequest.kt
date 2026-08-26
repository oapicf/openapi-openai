@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateMessageRequest(
    @field:JsonProperty("role")
    val role: kotlin.String,

    @field:JsonProperty("content")
    val content: CreateMessageRequestContent,

    @field:JsonProperty("attachments")
    val attachments: kotlin.collections.List<CreateMessageRequestAttachmentsInner>? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
