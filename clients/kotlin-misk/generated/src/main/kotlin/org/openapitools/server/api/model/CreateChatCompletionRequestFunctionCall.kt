package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChatCompletionFunctionCallOption
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateChatCompletionRequestFunctionCall(
    /** The name of the function to call. */
    val name: kotlin.String
)
