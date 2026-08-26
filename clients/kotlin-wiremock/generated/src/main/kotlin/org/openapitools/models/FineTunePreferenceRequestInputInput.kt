@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTunePreferenceRequestInputInput(
    @field:JsonProperty("messages")
    val messages: kotlin.collections.List<FineTuneChatRequestInputMessagesInner>? = null,

    @field:JsonProperty("tools")
    val tools: kotlin.collections.List<ChatCompletionTool>? = null,

    @field:JsonProperty("parallel_tool_calls")
    val parallelToolCalls: kotlin.Boolean? = true,

)
