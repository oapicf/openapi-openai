package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDeltaStepDetailsMessageCreationObject(
    /** Always &#x60;message_creation&#x60;. */
    val type: kotlin.String,
    val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null
)
