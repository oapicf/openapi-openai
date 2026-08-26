package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsToolCallsFunctionObjectFunction(
    /** The name of the function. */
    val name: kotlin.String? = null,
    /** The arguments passed to the function. */
    val arguments: kotlin.String? = null,
    /** The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    val output: kotlin.String? = null
)
