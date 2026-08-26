@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RunStepObject(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("assistant_id")
    val assistantId: kotlin.String,

    @field:JsonProperty("thread_id")
    val threadId: kotlin.String,

    @field:JsonProperty("run_id")
    val runId: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("status")
    val status: kotlin.String,

    @field:JsonProperty("step_details")
    val stepDetails: RunStepObjectStepDetails,

    @field:JsonProperty("last_error")
    val lastError: RunStepObjectLastError,

    @field:JsonProperty("expired_at")
    val expiredAt: kotlin.Int,

    @field:JsonProperty("cancelled_at")
    val cancelledAt: kotlin.Int,

    @field:JsonProperty("failed_at")
    val failedAt: kotlin.Int,

    @field:JsonProperty("completed_at")
    val completedAt: kotlin.Int,

    @field:JsonProperty("metadata")
    val metadata: kotlin.Any,

    @field:JsonProperty("usage")
    val usage: RunStepCompletionUsage,

)
