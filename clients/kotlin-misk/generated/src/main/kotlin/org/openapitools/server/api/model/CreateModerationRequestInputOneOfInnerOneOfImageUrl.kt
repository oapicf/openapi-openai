package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationRequestInputOneOfInnerOneOfImageUrl(
    /** Either a URL of the image or the base64 encoded image data. */
    val url: java.net.URI
)
