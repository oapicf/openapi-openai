package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunToolCallObjectFunction(
    /** The name of the function. */
    val name: kotlin.String,
    /** The arguments that the model expects you to pass to the function. */
    val arguments: kotlin.String
)
