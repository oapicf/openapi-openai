@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageObjectContentInner(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_file")
    val imageFile: MessageContentImageFileObjectImageFile,

    @field:JsonProperty("image_url")
    val imageUrl: MessageContentImageUrlObjectImageUrl,

    @field:JsonProperty("text")
    val text: MessageContentTextObjectText,

    @field:JsonProperty("refusal")
    val refusal: kotlin.String,

)
