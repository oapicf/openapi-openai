@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VectorStoreObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("usage_bytes")
    val usageBytes: kotlin.Int,

    @field:JsonProperty("file_counts")
    val fileCounts: VectorStoreObjectFileCounts,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("last_active_at")
    val lastActiveAt: kotlin.Int,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

    @field:JsonProperty("expires_after")
    val expiresAfter: VectorStoreExpirationAfter? = null,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int? = null,

)
