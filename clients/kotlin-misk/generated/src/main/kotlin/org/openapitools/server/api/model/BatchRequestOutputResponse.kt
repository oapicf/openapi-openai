package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BatchRequestOutputResponse(
    /** The HTTP status code of the response */
    val statusCode: kotlin.Int? = null,
    /** An unique identifier for the OpenAI API request. Please include this request ID when contacting support. */
    val requestId: kotlin.String? = null,
    /** The JSON body of the response */
    val body: kotlin.Any? = null
)
