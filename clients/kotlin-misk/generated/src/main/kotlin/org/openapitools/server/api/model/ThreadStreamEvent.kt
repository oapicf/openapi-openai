package org.openapitools.server.api.model

import org.openapitools.server.api.model.ThreadObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ThreadStreamEvent(
    val event: kotlin.String,
    val `data`: ThreadObject,
    /** Whether to enable input audio transcription. */
    val enabled: kotlin.Boolean? = null
)
