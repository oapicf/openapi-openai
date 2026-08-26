package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionFunctionCallOption(
    /** The name of the function to call. */
    val name: kotlin.String
)
