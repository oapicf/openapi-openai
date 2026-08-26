package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsCodeOutputImageObjectImage(
    /** The [file](/docs/api-reference/files) ID of the image. */
    val fileId: kotlin.String
)
