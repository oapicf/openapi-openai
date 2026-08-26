@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningJobEvent(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("level")
    val level: kotlin.String,

    @field:JsonProperty("message")
    val message: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.Any? = null,

)
