package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepDetailsMessageCreationObjectMessageCreation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsMessageCreationObject(
    /** Always &#x60;message_creation&#x60;. */
    val type: kotlin.String,
    val messageCreation: RunStepDetailsMessageCreationObjectMessageCreation
)
