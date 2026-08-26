package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentImageFileObjectImageFile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentImageFileObject(
    /** Always &#x60;image_file&#x60;. */
    val type: kotlin.String,
    val imageFile: MessageContentImageFileObjectImageFile
)
