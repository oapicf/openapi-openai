package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageStreamEventOneOf1(
    val event: kotlin.String,
    val `data`: MessageObject
)
