package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageStreamEventOneOf2(
    val event: kotlin.String,
    val `data`: MessageDeltaObject
)
