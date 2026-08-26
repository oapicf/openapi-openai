package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateMessageRequest
import org.openapitools.server.api.model.CreateThreadRequestToolResources
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateThreadRequest(
    /** A list of [messages](/docs/api-reference/messages) to start the thread with. */
    val messages: kotlin.collections.List<CreateMessageRequest>? = null,
    val toolResources: CreateThreadRequestToolResources? = null,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any? = null
)
