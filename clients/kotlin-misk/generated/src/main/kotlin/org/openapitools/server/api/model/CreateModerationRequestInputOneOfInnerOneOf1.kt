package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationRequestInputOneOfInnerOneOf1(
    /** Always &#x60;text&#x60;. */
    val type: kotlin.String,
    /** A string of text to classify. */
    val text: kotlin.String
)
