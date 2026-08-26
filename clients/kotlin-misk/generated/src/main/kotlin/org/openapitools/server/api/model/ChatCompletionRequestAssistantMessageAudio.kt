package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestAssistantMessageAudio(
    /** Unique identifier for a previous audio response from the model.  */
    val id: kotlin.String
)
