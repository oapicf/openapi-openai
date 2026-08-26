package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(
    /** The index of the output in the outputs array. */
    val index: kotlin.Int,
    /** Always &#x60;image&#x60;. */
    val type: kotlin.String,
    val image: RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage? = null
)
