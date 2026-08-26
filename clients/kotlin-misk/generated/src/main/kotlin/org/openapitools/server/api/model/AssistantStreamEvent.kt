package org.openapitools.server.api.model

import org.openapitools.server.api.model.DoneEvent
import org.openapitools.server.api.model.ErrorEvent
import org.openapitools.server.api.model.MessageStreamEvent
import org.openapitools.server.api.model.RunStepStreamEvent
import org.openapitools.server.api.model.RunStreamEvent
import org.openapitools.server.api.model.ThreadStreamEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssistantStreamEvent(
    val event: kotlin.String,
    val `data`: kotlin.String,
    /** Whether to enable input audio transcription. */
    val enabled: kotlin.Boolean? = null
)
