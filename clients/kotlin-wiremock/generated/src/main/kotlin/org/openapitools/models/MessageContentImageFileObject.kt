@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageContentImageFileObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_file")
    val imageFile: MessageContentImageFileObjectImageFile,

)
