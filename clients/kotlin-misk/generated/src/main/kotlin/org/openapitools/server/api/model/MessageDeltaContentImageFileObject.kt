package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentImageFileObject(
    /** The index of the content part in the message. */
    val index: kotlin.Int,
    /** Always &#x60;image_file&#x60;. */
    val type: kotlin.String,
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null
)
