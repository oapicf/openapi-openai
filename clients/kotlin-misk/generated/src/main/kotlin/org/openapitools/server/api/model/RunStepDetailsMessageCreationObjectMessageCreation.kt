package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepDetailsMessageCreationObjectMessageCreation(
    /** The ID of the message that was created by this run step. */
    val messageId: kotlin.String
)
