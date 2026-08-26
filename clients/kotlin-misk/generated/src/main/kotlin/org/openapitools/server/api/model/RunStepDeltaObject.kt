package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaObjectDelta
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaObject(
    /** The identifier of the run step, which can be referenced in API endpoints. */
    val id: kotlin.String,
    /** The object type, which is always &#x60;thread.run.step.delta&#x60;. */
    val `object`: kotlin.String,
    val delta: RunStepDeltaObjectDelta
)
