@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ImagesResponse(
    @field:JsonProperty("created")
    val created: kotlin.Int,

    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<Image>,

)
