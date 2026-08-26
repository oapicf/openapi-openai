package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunStepObject
import org.openapitools.server.api.model.RunStepStreamEventOneOf
import org.openapitools.server.api.model.RunStepStreamEventOneOf1
import org.openapitools.server.api.model.RunStepStreamEventOneOf2
import org.openapitools.server.api.model.RunStepStreamEventOneOf3
import org.openapitools.server.api.model.RunStepStreamEventOneOf4
import org.openapitools.server.api.model.RunStepStreamEventOneOf5
import org.openapitools.server.api.model.RunStepStreamEventOneOf6
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStepStreamEvent(
    val event: kotlin.String,
    val `data`: RunStepObject
)
