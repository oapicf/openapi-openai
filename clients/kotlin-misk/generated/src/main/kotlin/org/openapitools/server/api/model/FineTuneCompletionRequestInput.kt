package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuneCompletionRequestInput(
    /** The input prompt for this training example. */
    val prompt: kotlin.String? = null,
    /** The desired completion for this training example. */
    val completion: kotlin.String? = null
)
