package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionFunctions
import org.openapitools.server.api.model.ChatCompletionTool
import org.openapitools.server.api.model.FineTuneChatRequestInputMessagesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneChatRequestInput(
    val messages: kotlin.collections.List<FineTuneChatRequestInputMessagesInner>? = null,
    /** A list of tools the model may generate JSON inputs for. */
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,
    /** Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    val parallelToolCalls: kotlin.Boolean? = true,
    /** A list of functions the model may generate JSON inputs for. */
    val functions: kotlin.collections.List<ChatCompletionFunctions>? = null
)
