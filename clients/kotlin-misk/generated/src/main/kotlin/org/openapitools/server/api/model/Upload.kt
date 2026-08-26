package org.openapitools.server.api.model

import org.openapitools.server.api.model.OpenAIFile
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Upload(
    /** The Upload unique identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) for when the Upload was created. */
    val createdAt: kotlin.Int,
    /** The name of the file to be uploaded. */
    val filename: kotlin.String,
    /** The intended number of bytes to be uploaded. */
    val bytes: kotlin.Int,
    /** The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. */
    val purpose: kotlin.String,
    /** The status of the Upload. */
    val status: kotlin.String,
    /** The Unix timestamp (in seconds) for when the Upload was created. */
    val expiresAt: kotlin.Int,
    /** The object type, which is always \&quot;upload\&quot;. */
    val `object`: kotlin.String? = null,
    val file: OpenAIFile? = null
)
