package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeConversationItemContentInner(
    /** The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).  */
    val type: kotlin.String? = null,
    /** The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.  */
    val text: kotlin.String? = null,
    /** ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.  */
    val id: kotlin.String? = null,
    /** Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.  */
    val audio: kotlin.String? = null,
    /** The transcript of the audio, used for &#x60;input_audio&#x60; content type.  */
    val transcript: kotlin.String? = null
)
