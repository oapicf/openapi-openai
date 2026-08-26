@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Model(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created")
    val created: kotlin.Int,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("owned_by")
    val ownedBy: kotlin.String,

)
