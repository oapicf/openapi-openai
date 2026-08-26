@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class VectorStoreFileBatchObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("vector_store_id")
    val vectorStoreId: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("file_counts")
    val fileCounts: VectorStoreFileBatchObjectFileCounts,

)
