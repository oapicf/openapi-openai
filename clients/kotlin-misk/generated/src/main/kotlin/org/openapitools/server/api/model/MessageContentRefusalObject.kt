package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentRefusalObject(
    /** Always &#x60;refusal&#x60;. */
    val type: kotlin.String,
    val refusal: kotlin.String
)
