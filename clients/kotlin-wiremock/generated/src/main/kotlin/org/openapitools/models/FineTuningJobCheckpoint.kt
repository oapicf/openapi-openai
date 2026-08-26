@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class FineTuningJobCheckpoint(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int,

    @field:JsonProperty("fine_tuned_model_checkpoint")
    val fineTunedModelCheckpoint: kotlin.String,

    @field:JsonProperty("step_number")
    val stepNumber: kotlin.Int,

    @field:JsonProperty("metrics")
    val metrics: FineTuningJobCheckpointMetrics,

    @field:JsonProperty("fine_tuning_job_id")
    val fineTuningJobId: kotlin.String,

    @field:JsonProperty("object")
    val `object`: kotlin.String,

)
