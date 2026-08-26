package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventErrorError(
    /** The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).  */
    val type: kotlin.String,
    /** A human-readable error message. */
    val message: kotlin.String,
    /** Error code, if any. */
    val code: kotlin.String? = null,
    /** Parameter related to the error, if any. */
    val `param`: kotlin.String? = null,
    /** The event_id of the client event that caused the error, if applicable.  */
    val eventId: kotlin.String? = null
)
