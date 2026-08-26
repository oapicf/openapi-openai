@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationRequest(
    @field:JsonProperty("input")
    val input: CreateModerationRequestInput,

    @field:JsonProperty("model")
    val model: CreateModerationRequestModel? = null,

)
