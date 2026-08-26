@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ThreadObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("tool_resources")
    val toolResources: ModifyThreadRequestToolResources,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

)
