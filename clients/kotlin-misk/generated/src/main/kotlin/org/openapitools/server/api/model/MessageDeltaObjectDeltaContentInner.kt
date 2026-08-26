package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaContentImageFileObject
import org.openapitools.server.api.model.MessageDeltaContentImageFileObjectImageFile
import org.openapitools.server.api.model.MessageDeltaContentImageUrlObject
import org.openapitools.server.api.model.MessageDeltaContentImageUrlObjectImageUrl
import org.openapitools.server.api.model.MessageDeltaContentRefusalObject
import org.openapitools.server.api.model.MessageDeltaContentTextObject
import org.openapitools.server.api.model.MessageDeltaContentTextObjectText
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaObjectDeltaContentInner(
    /** The index of the content part in the message. */
    val index: kotlin.Int,
    /** Always &#x60;image_file&#x60;. */
    val type: kotlin.String,
    val imageFile: MessageDeltaContentImageFileObjectImageFile? = null,
    val text: MessageDeltaContentTextObjectText? = null,
    val refusal: kotlin.String? = null,
    val imageUrl: MessageDeltaContentImageUrlObjectImageUrl? = null
)
