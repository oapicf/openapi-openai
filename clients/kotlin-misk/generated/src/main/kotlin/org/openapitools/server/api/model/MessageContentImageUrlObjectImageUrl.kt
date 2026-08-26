package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageContentImageUrlObjectImageUrl(
    /** The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. */
    val url: java.net.URI,
    /** Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. Default value is &#x60;auto&#x60; */
    val detail: kotlin.String? = Detail.auto
)
