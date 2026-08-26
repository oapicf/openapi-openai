@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateModerationRequestInputOneOfInner(
    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("image_url")
    val imageUrl: CreateModerationRequestInputOneOfInnerOneOfImageUrl,

    @field:JsonProperty("text")
    val text: kotlin.String,

)
