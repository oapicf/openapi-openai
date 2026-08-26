package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
    /** The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;. */
    val b64Json: kotlin.String? = null,
    /** The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default). */
    val url: kotlin.String? = null,
    /** The prompt that was used to generate the image, if there was any revision to the prompt. */
    val revisedPrompt: kotlin.String? = null
)
