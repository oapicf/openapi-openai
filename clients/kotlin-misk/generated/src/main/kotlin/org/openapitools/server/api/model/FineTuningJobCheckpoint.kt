package org.openapitools.server.api.model

import org.openapitools.server.api.model.FineTuningJobCheckpointMetrics
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FineTuningJobCheckpoint(
    /** The checkpoint identifier, which can be referenced in the API endpoints. */
    val id: kotlin.String,
    /** The Unix timestamp (in seconds) for when the checkpoint was created. */
    val createdAt: kotlin.Int,
    /** The name of the fine-tuned checkpoint model that is created. */
    val fineTunedModelCheckpoint: kotlin.String,
    /** The step number that the checkpoint was created at. */
    val stepNumber: kotlin.Int,
    val metrics: FineTuningJobCheckpointMetrics,
    /** The name of the fine-tuning job that this checkpoint was created from. */
    val fineTuningJobId: kotlin.String,
    /** The object type, which is always \&quot;fine_tuning.job.checkpoint\&quot;. */
    val `object`: kotlin.String
)
