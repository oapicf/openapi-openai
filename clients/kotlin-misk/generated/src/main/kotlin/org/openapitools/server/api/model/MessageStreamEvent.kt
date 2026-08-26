package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageObject
import org.openapitools.server.api.model.MessageStreamEventOneOf
import org.openapitools.server.api.model.MessageStreamEventOneOf1
import org.openapitools.server.api.model.MessageStreamEventOneOf2
import org.openapitools.server.api.model.MessageStreamEventOneOf3
import org.openapitools.server.api.model.MessageStreamEventOneOf4
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageStreamEvent(
    val event: kotlin.String,
    val `data`: MessageObject
)
