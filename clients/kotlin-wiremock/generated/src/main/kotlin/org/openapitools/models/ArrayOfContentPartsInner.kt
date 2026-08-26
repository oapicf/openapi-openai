@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ArrayOfContentPartsInner(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_file")
    val imageFile: MessageContentImageFileObjectImageFile,

    @field:JsonProperty("image_url")
    val imageUrl: MessageContentImageUrlObjectImageUrl,

    @field:JsonProperty("text")
    val text: kotlin.String,

)
