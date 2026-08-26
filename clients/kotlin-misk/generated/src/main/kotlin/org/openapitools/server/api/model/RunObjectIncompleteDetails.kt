package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunObjectIncompleteDetails(
    /** The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. */
    val reason: kotlin.String? = null
)
