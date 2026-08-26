@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaObjectDeltaContentInner(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_file")
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,

    @field:JsonProperty("text")
    val text: MessageDeltaContentTextObjectText? = null,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String? = null,

    @field:JsonProperty("image_url")
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null,

)
