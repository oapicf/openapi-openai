package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionFunctions(
    /** The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
    val name: kotlin.String,
    /** A description of what the function does, used by the model to choose when and how to call the function. */
    val description: kotlin.String? = null,
    /** The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list. */
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
)
