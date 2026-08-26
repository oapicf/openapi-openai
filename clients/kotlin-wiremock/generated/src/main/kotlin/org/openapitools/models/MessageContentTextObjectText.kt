@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageContentTextObjectText(
    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("annotations")
    val annotations: kotlin.collections.List<MessageContentTextObjectTextAnnotationsInner>,

)
