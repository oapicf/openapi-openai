package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseFormatText(
    /** The type of response format being defined: &#x60;text&#x60; */
    val type: kotlin.String
)
