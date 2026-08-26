package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsFunctionObjectFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFunctionObject(
    /** The ID of the tool call object. */
    val id: kotlin.String,
    /** The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. */
    val type: kotlin.String,
    val function: RunStepDetailsToolCallsFunctionObjectFunction
)
