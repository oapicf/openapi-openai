package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChatCompletionRequestMessageContentPartImageImageUrl(
    /** Either a URL of the image or the base64 encoded image data. */
    val url: java.net.URI,
    /** Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding). */
    val detail: kotlin.String? = Detail.auto
)
