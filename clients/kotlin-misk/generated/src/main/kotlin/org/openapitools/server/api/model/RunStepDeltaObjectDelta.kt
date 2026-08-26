package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaObjectDeltaStepDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaObjectDelta(
    val stepDetails: RunStepDeltaObjectDeltaStepDetails? = null
)
