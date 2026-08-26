package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(
    /** The type of error. */
    val type: kotlin.String? = null,
    /** Error code, if any. */
    val code: kotlin.String? = null,
    /** A human-readable error message. */
    val message: kotlin.String? = null,
    /** Parameter related to the error, if any. */
    val `param`: kotlin.String? = null
)
