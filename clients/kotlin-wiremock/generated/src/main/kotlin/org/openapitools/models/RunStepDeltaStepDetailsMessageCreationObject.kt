@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepDeltaStepDetailsMessageCreationObject(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("message_creation")
    val messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? = null,

)
