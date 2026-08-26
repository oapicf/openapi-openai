@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateMessageRequestAttachmentsInner(
    @field:JsonProperty("file_id")
    val fileId: kotlin.String? = null,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<CreateMessageRequestAttachmentsInnerToolsInner>? = null,

)
