package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
    /** The ID of the specific File the citation is from. */
    val fileId: kotlin.String? = null,
    /** The specific quote in the file. */
    val quote: kotlin.String? = null
)
