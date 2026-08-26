package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UploadPart(
    /** The upload Part unique identifier, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) for when the Part was created. */
    val createdAt: kotlin.Int,
    /** The ID of the Upload object that this Part was added to. */
    val uploadId: kotlin.String,
    /** The object type, which is always &#x60;upload.part&#x60;. */
    val `object`: kotlin.String
)
