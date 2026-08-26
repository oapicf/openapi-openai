@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationResponse(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("model")
    val model: kotlin.String,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<CreateModerationResponseResultsInner>,

)
