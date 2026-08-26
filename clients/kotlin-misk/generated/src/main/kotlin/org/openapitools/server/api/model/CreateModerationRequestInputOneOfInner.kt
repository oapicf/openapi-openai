package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOf
import org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOf1
import org.openapitools.server.api.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationRequestInputOneOfInner(
    /** Always &#x60;image_url&#x60;. */
    val type: kotlin.String,
    val imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,
    /** A string of text to classify. */
    val text: kotlin.String
)
