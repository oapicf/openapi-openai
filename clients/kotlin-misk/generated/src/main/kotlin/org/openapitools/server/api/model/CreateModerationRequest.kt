package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateModerationRequestInput
import org.openapitools.server.api.model.CreateModerationRequestModel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateModerationRequest(
    val input: CreateModerationRequestInput,
    val model: CreateModerationRequestModel? = null
)
