package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepStreamEventOneOf(
    val event: kotlin.String,
    val `data`: RunStepObject
)
