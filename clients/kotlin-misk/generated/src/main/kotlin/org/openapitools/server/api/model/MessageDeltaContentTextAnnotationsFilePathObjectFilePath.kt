package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentTextAnnotationsFilePathObjectFilePath(
    /** The ID of the file that was generated. */
    val fileId: kotlin.String? = null
)
