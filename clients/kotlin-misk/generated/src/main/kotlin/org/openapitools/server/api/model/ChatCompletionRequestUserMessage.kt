package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestUserMessageContent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestUserMessage(
    val content: ChatCompletionRequestUserMessageContent,
    /** The role of the messages author, in this case &#x60;user&#x60;. */
    val role: kotlin.String,
    /** An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    val name: kotlin.String? = null
)
