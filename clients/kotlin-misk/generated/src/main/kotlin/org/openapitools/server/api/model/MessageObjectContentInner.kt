package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageContentImageFileObject
import org.openapitools.server.api.model.MessageContentImageFileObjectImageFile
import org.openapitools.server.api.model.MessageContentImageUrlObject
import org.openapitools.server.api.model.MessageContentImageUrlObjectImageUrl
import org.openapitools.server.api.model.MessageContentRefusalObject
import org.openapitools.server.api.model.MessageContentTextObject
import org.openapitools.server.api.model.MessageContentTextObjectText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageObjectContentInner(
    /** Always &#x60;image_file&#x60;. */
    val type: kotlin.String,
    val imageFile: MessageContentImageFileObjectImageFile,
    val imageUrl: MessageContentImageUrlObjectImageUrl,
    val text: MessageContentTextObjectText,
    val refusal: kotlin.String
)
