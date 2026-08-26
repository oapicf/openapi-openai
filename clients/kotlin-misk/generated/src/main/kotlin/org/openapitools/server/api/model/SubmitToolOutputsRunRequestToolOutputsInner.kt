package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SubmitToolOutputsRunRequestToolOutputsInner(
    /** The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for. */
    val toolCallId: kotlin.String? = null,
    /** The output of the tool call to be submitted to continue the run. */
    val output: kotlin.String? = null
)
