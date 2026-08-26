package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaContentRefusalObject(
    /** The index of the refusal part in the message. */
    val index: kotlin.Int,
    /** Always &#x60;refusal&#x60;. */
    val type: kotlin.String,
    val refusal: kotlin.String? = null
)
