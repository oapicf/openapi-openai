@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MessageDeltaContentImageFileObject(
    @field:JsonProperty("index")
    val index: kotlin.Int,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_file")
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,

)
