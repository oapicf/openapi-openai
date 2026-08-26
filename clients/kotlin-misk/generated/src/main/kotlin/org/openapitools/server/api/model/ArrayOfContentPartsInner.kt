package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentImageFileObject
import org.openapitools.server.api.model.MessageContentImageFileObjectImageFile
import org.openapitools.server.api.model.MessageContentImageUrlObject
import org.openapitools.server.api.model.MessageContentImageUrlObjectImageUrl
import org.openapitools.server.api.model.MessageRequestContentTextObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArrayOfContentPartsInner(
    /** Always &#x60;image_file&#x60;. */
    val type: kotlin.String,
    val imageFile: MessageContentImageFileObjectImageFile,
    val imageUrl: MessageContentImageUrlObjectImageUrl,
    /** Text content to be sent to the model */
    val text: kotlin.String
)
