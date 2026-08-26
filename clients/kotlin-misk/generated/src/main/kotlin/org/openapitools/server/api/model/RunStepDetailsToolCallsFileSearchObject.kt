package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsFileSearchObjectFileSearch
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFileSearchObject(
    /** The ID of the tool call object. */
    val id: kotlin.String,
    /** The type of tool call. This is always going to be &#x60;file_search&#x60; for this type of tool call. */
    val type: kotlin.String,
    val fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
)
