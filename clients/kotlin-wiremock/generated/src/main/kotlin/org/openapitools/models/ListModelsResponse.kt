@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ListModelsResponse(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<Model>,

)
