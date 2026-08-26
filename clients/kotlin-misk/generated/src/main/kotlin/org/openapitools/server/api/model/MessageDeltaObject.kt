package org.openapitools.server.api.model

import org.openapitools.server.api.model.MessageDeltaObjectDelta
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageDeltaObject(
    /** The identifier of the message, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread.message.delta&#x60;. */
    val `object`: kotlin.String,
    val delta: MessageDeltaObjectDelta
)
