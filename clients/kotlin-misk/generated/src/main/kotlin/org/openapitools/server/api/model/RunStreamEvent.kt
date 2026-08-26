package org.openapitools.server.api.model

import org.openapitools.server.api.model.RunObject
import org.openapitools.server.api.model.RunStreamEventOneOf
import org.openapitools.server.api.model.RunStreamEventOneOf1
import org.openapitools.server.api.model.RunStreamEventOneOf2
import org.openapitools.server.api.model.RunStreamEventOneOf3
import org.openapitools.server.api.model.RunStreamEventOneOf4
import org.openapitools.server.api.model.RunStreamEventOneOf5
import org.openapitools.server.api.model.RunStreamEventOneOf6
import org.openapitools.server.api.model.RunStreamEventOneOf7
import org.openapitools.server.api.model.RunStreamEventOneOf8
import org.openapitools.server.api.model.RunStreamEventOneOf9
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RunStreamEvent(
    val event: kotlin.String,
    val `data`: RunObject
)
