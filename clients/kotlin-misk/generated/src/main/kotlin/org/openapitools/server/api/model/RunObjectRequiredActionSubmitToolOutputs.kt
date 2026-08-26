package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunToolCallObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunObjectRequiredActionSubmitToolOutputs(
    /** A list of the relevant tool calls. */
    val toolCalls: kotlin.collections.List<RunToolCallObject>
)
