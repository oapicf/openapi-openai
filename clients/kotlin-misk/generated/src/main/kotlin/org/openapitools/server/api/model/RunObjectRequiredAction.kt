package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunObjectRequiredActionSubmitToolOutputs
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunObjectRequiredAction(
    /** For now, this is always &#x60;submit_tool_outputs&#x60;. */
    val type: kotlin.String,
    val submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
)
