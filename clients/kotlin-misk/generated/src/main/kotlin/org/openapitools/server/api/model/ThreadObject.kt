package org.openapitools.server.api.model

import org.openapitools.server.api.model.ModifyThreadRequestToolResources
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ThreadObject(
    /** The identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread&#x60;. */
    val `object`: kotlin.String,
    /** The Unix timestamp (in seconds) for when the thread was created. */
    val createdAt: kotlin.Int,
    val toolResources: ModifyThreadRequestToolResources,
    /** Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    val metadata: kotlin.Any
)
