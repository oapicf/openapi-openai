package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateModerationResponseResultsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationResponse(
    /** The unique identifier for the moderation request. */
    val id: kotlin.String,
    /** The model used to generate the moderation results. */
    val model: kotlin.String,
    /** A list of moderation objects. */
    val results: kotlin.collections.List<CreateModerationResponseResultsInner>
)
