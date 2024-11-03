package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FineTuningJobError
import org.openapitools.model.FineTuningJobHyperparameters
import org.openapitools.model.FineTuningJobIntegrationsInner
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
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 * @param id The object identifier, which can be referenced in the API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param error 
 * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @param hyperparameters 
 * @param model The base model that is being fine-tuned.
 * @param &#x60;object&#x60; The object type, which is always \"fine_tuning.job\".
 * @param organizationId The organization that owns the fine-tuning job.
 * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param seed The seed used for the fine-tuning job.
 * @param integrations A list of integrations to enable for this fine-tuning job.
 */
data class FineTuningJob(

    @Schema(example = "null", required = true, description = "The object identifier, which can be referenced in the API endpoints.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the fine-tuning job was created.")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("error", required = true) val error: FineTuningJobError?,

    @Schema(example = "null", required = true, description = "The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.")
    @get:JsonProperty("fine_tuned_model", required = true) val fineTunedModel: kotlin.String?,

    @Schema(example = "null", required = true, description = "The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.")
    @get:JsonProperty("finished_at", required = true) val finishedAt: kotlin.Int?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("hyperparameters", required = true) val hyperparameters: FineTuningJobHyperparameters,

    @Schema(example = "null", required = true, description = "The base model that is being fine-tuned.")
    @get:JsonProperty("model", required = true) val model: kotlin.String,

    @Schema(example = "null", required = true, description = "The object type, which is always \"fine_tuning.job\".")
    @get:JsonProperty("object", required = true) val `object`: FineTuningJob.`Object`,

    @Schema(example = "null", required = true, description = "The organization that owns the fine-tuning job.")
    @get:JsonProperty("organization_id", required = true) val organizationId: kotlin.String,

    @Schema(example = "null", required = true, description = "The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).")
    @get:JsonProperty("result_files", required = true) val resultFiles: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", required = true, description = "The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.")
    @get:JsonProperty("status", required = true) val status: FineTuningJob.Status,

    @Schema(example = "null", required = true, description = "The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.")
    @get:JsonProperty("trained_tokens", required = true) val trainedTokens: kotlin.Int?,

    @Schema(example = "null", required = true, description = "The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).")
    @get:JsonProperty("training_file", required = true) val trainingFile: kotlin.String,

    @Schema(example = "null", required = true, description = "The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).")
    @get:JsonProperty("validation_file", required = true) val validationFile: kotlin.String?,

    @Schema(example = "null", required = true, description = "The seed used for the fine-tuning job.")
    @get:JsonProperty("seed", required = true) val seed: kotlin.Int,

    @field:Valid
    @get:Size(max=5)
    @Schema(example = "null", description = "A list of integrations to enable for this fine-tuning job.")
    @get:JsonProperty("integrations") val integrations: kotlin.collections.List<FineTuningJobIntegrationsInner>? = null
    ) {

    /**
    * The object type, which is always \"fine_tuning.job\".
    * Values: fine_tuningPeriodJob
    */
    enum class `Object`(@get:JsonValue val value: kotlin.String) {

        fine_tuningPeriodJob("fine_tuning.job");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Object` {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    * Values: validating_files,queued,running,succeeded,failed,cancelled
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        validating_files("validating_files"),
        queued("queued"),
        running("running"),
        succeeded("succeeded"),
        failed("failed"),
        cancelled("cancelled");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().first{it -> it.value == value}
            }
        }
    }

}

