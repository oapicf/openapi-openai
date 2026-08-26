package org.openapitools.server.api.model

import org.openapitools.server.api.model.SubmitToolOutputsRunRequestToolOutputsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SubmitToolOutputsRunRequest(
    /** A list of tools for which the outputs are being submitted. */
    val toolOutputs: kotlin.collections.List<SubmitToolOutputsRunRequestToolOutputsInner>,
    /** If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  */
    val stream: kotlin.Boolean? = null
)
