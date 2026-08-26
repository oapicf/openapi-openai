package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsToolCallsFunctionObjectFunction(
    /** The name of the function. */
    val name: kotlin.String,
    /** The arguments passed to the function. */
    val arguments: kotlin.String,
    /** The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    val output: kotlin.String
)
