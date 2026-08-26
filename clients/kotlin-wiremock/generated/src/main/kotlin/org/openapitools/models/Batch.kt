@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Batch(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("endpoint")
    val endpoint: kotlin.String,

    @field:JsonProperty("input_file_id")
    val inputFileId: kotlin.String,

    @field:JsonProperty("completion_window")
    val completionWindow: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("errors")
    val errors: BatchErrors? = null,

    @field:JsonProperty("output_file_id")
    val outputFileId: kotlin.String? = null,

    @field:JsonProperty("error_file_id")
    val errorFileId: kotlin.String? = null,

    @field:JsonProperty("in_progress_at")
    val inProgressAt: kotlin.Int? = null,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int? = null,

    @field:JsonProperty("finalizing_at")
    val finalizingAt: kotlin.Int? = null,

    @field:JsonProperty("completed_at")
    val completedAt: kotlin.Int? = null,

    @field:JsonProperty("failed_at")
    val failedAt: kotlin.Int? = null,

    @field:JsonProperty("expired_at")
    val expiredAt: kotlin.Int? = null,

    @field:JsonProperty("cancelling_at")
    val cancellingAt: kotlin.Int? = null,

    @field:JsonProperty("cancelled_at")
    val cancelledAt: kotlin.Int? = null,

    @field:JsonProperty("request_counts")
    val requestCounts: BatchRequestCounts? = null,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any? = null,

)
