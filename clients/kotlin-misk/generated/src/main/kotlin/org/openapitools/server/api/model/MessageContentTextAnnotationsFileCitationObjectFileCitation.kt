package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentTextAnnotationsFileCitationObjectFileCitation(
    /** The ID of the specific File the citation is from. */
    val fileId: kotlin.String
)
