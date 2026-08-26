@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentTextObjectText(
    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    @field:JsonProperty("annotations")
    val annotations: kotlin.collections.List<MessageDeltaContentTextObjectTextAnnotationsInner>? = null,

)
