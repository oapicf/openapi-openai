package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunToolCallObjectFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunToolCallObject(
    /** The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
    val id: kotlin.String,
    /** The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. */
    val type: kotlin.String,
    val function: RunToolCallObjectFunction
)
