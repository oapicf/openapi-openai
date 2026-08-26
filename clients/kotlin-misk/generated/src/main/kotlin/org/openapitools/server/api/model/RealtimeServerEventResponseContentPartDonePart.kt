package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventResponseContentPartDonePart(
    /** The content type (\&quot;text\&quot;, \&quot;audio\&quot;). */
    val type: kotlin.String? = null,
    /** The text content (if type is \&quot;text\&quot;). */
    val text: kotlin.String? = null,
    /** Base64-encoded audio data (if type is \&quot;audio\&quot;). */
    val audio: kotlin.String? = null,
    /** The transcript of the audio (if type is \&quot;audio\&quot;). */
    val transcript: kotlin.String? = null
)
