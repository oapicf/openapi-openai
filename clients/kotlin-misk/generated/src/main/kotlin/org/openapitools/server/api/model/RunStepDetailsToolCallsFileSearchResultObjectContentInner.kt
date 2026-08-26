package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFileSearchResultObjectContentInner(
    /** The type of the content. */
    val type: kotlin.String? = null,
    /** The text content of the file. */
    val text: kotlin.String? = null
)
