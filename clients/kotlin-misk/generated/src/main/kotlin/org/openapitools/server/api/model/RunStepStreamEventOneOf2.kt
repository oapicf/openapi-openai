package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepStreamEventOneOf2(
    val event: kotlin.String,
    val `data`: RunStepDeltaObject
)
