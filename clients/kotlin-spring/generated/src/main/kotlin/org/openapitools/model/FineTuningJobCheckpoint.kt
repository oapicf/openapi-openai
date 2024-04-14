package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FineTuningJobCheckpointMetrics
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 * @param id The checkpoint identifier, which can be referenced in the API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the checkpoint was created.
 * @param fineTunedModelCheckpoint The name of the fine-tuned checkpoint model that is created.
 * @param stepNumber The step number that the checkpoint was created at.
 * @param metrics 
 * @param fineTuningJobId The name of the fine-tuning job that this checkpoint was created from.
 * @param &#x60;object&#x60; The object type, which is always \"fine_tuning.job.checkpoint\".
 */
data class FineTuningJobCheckpoint(

    @Schema(example = "null", required = true, description = "The checkpoint identifier, which can be referenced in the API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the checkpoint was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @Schema(example = "null", required = true, description = "The name of the fine-tuned checkpoint model that is created.")
    @get:JsonProperty("fine_tuned_model_checkpoint", required = true) val fineTunedModelCheckpoint: kotlin.String,

    @Schema(example = "null", required = true, description = "The step number that the checkpoint was created at.")
    @get:JsonProperty("step_number", required = true) val stepNumber: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("metrics", required = true) val metrics: FineTuningJobCheckpointMetrics,

    @Schema(example = "null", required = true, description = "The name of the fine-tuning job that this checkpoint was created from.")
    @get:JsonProperty("fine_tuning_job_id", required = true) val fineTuningJobId: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always \"fine_tuning.job.checkpoint\".")
    @get:JsonProperty("object", required = true) val `object`: FineTuningJobCheckpoint.`Object`
) {

    /**
    * The object type, which is always \"fine_tuning.job.checkpoint\".
    * Values: fine_tuningPeriodJobPeriodCheckpoint
    */
    enum class `Object`(val value: kotlin.String) {

        @JsonProperty("fine_tuning.job.checkpoint") fine_tuningPeriodJobPeriodCheckpoint("fine_tuning.job.checkpoint")
    }

}

