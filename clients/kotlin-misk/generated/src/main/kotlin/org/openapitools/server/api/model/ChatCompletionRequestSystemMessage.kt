package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestSystemMessageContent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestSystemMessage(
    val content: ChatCompletionRequestSystemMessageContent,
    /** The role of the messages author, in this case &#x60;system&#x60;. */
    val role: kotlin.String,
    /** An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    val name: kotlin.String? = null
)
