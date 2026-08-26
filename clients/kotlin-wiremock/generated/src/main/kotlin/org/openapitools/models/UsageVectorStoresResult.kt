@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UsageVectorStoresResult(
    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("usage_bytes")
    val usageBytes: kotlin.Int,

    @field:JsonProperty("project_id")
    val projectId: kotlin.String? = null,

)
