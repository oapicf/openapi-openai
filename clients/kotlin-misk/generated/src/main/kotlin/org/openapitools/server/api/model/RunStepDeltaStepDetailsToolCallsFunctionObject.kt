package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsFunctionObject(
    /** The index of the tool call in the tool calls array. */
    val index: kotlin.Int,
    /** The type of tool call. This is always going to be &#x60;function&#x60; for this type of tool call. */
    val type: kotlin.String,
    /** The ID of the tool call object. */
    val id: kotlin.String? = null,
    val function: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction? = null
)
