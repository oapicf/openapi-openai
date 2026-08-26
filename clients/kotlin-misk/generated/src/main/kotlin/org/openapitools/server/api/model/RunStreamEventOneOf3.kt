package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunObject
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStreamEventOneOf3(
    val event: kotlin.String,
    val `data`: RunObject
)
