@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentImageUrlObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_url")
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null,

)
