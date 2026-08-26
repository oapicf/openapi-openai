package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsFileSearchObject(
    /** The index of the tool call in the tool calls array. */
    val index: kotlin.Int,
    /** The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. */
    val type: kotlin.String,
    /** For now, this is always going to be an empty object. */
    val fileSearch: kotlin.Any,
    /** The ID of the tool call object. */
    val id: kotlin.String? = null
)
