package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateSpeechRequestModel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateSpeechRequest(
    val model: CreateSpeechRequestModel,
    /** The text to generate audio for. The maximum length is 4096 characters. */
    val input: kotlin.String,
    /** The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options). */
    val voice: kotlin.String,
    /** The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;. */
    val responseFormat: kotlin.String? = ResponseFormat.mp3,
    /** The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default. */
    val speed: java.math.BigDecimal? = java.math.BigDecimal("1")
)
