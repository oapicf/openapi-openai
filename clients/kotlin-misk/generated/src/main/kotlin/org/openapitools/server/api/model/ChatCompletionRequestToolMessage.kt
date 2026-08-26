package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionRequestToolMessageContent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestToolMessage(
    /** The role of the messages author, in this case &#x60;tool&#x60;. */
    val role: kotlin.String,
    val content: ChatCompletionRequestToolMessageContent,
    /** Tool call that this message is responding to. */
    val toolCallId: kotlin.String
)
