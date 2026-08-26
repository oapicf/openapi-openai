package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageObjectIncompleteDetails(
    /** The reason the message is incomplete. */
    val reason: kotlin.String
)
