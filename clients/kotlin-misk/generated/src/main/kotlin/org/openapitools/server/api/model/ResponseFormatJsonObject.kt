package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseFormatJsonObject(
    /** The type of response format being defined: &#x60;json_object&#x60; */
    val type: kotlin.String
)
