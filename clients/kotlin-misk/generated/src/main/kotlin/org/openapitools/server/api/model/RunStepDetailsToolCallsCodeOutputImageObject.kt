package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeOutputImageObjectImage
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsCodeOutputImageObject(
    /** Always &#x60;image&#x60;. */
    val type: kotlin.String,
    val image: RunStepDetailsToolCallsCodeOutputImageObjectImage
)
