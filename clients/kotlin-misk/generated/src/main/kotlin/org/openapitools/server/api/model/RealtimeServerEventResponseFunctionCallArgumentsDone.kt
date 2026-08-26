package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeServerEventResponseFunctionCallArgumentsDone(
    /** The unique ID of the server event. */
    val eventId: kotlin.String,
    /** The event type, must be &#x60;response.function_call_arguments.done&#x60;.  */
    val type: kotlin.String,
    /** The ID of the response. */
    val responseId: kotlin.String,
    /** The ID of the function call item. */
    val itemId: kotlin.String,
    /** The index of the output item in the response. */
    val outputIndex: kotlin.Int,
    /** The ID of the function call. */
    val callId: kotlin.String,
    /** The final arguments as a JSON string. */
    val arguments: kotlin.String
)
