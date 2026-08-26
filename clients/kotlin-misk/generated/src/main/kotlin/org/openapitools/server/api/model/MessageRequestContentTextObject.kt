package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageRequestContentTextObject(
    /** Always &#x60;text&#x60;. */
    val type: kotlin.String,
    /** Text content to be sent to the model */
    val text: kotlin.String
)
