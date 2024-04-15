/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.FineTuningJobError
import org.openapitools.client.models.FineTuningJobHyperparameters
import org.openapitools.client.models.FineTuningJobIntegrationsInner

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 *
 * @param id The object identifier, which can be referenced in the API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param error 
 * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @param hyperparameters 
 * @param model The base model that is being fine-tuned.
 * @param `object` The object type, which is always \"fine_tuning.job\".
 * @param organizationId The organization that owns the fine-tuning job.
 * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param seed The seed used for the fine-tuning job.
 * @param integrations A list of integrations to enable for this fine-tuning job.
 */


data class FineTuningJob (

    /* The object identifier, which can be referenced in the API endpoints. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    @Json(name = "error")
    val error: FineTuningJobError?,

    /* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    @Json(name = "fine_tuned_model")
    val fineTunedModel: kotlin.String?,

    /* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    @Json(name = "finished_at")
    val finishedAt: kotlin.Int?,

    @Json(name = "hyperparameters")
    val hyperparameters: FineTuningJobHyperparameters,

    /* The base model that is being fine-tuned. */
    @Json(name = "model")
    val model: kotlin.String,

    /* The object type, which is always \"fine_tuning.job\". */
    @Json(name = "object")
    val `object`: FineTuningJob.`Object`,

    /* The organization that owns the fine-tuning job. */
    @Json(name = "organization_id")
    val organizationId: kotlin.String,

    /* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    @Json(name = "result_files")
    val resultFiles: kotlin.collections.List<kotlin.String>,

    /* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
    @Json(name = "status")
    val status: FineTuningJob.Status,

    /* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    @Json(name = "trained_tokens")
    val trainedTokens: kotlin.Int?,

    /* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    @Json(name = "training_file")
    val trainingFile: kotlin.String,

    /* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    @Json(name = "validation_file")
    val validationFile: kotlin.String?,

    /* The seed used for the fine-tuning job. */
    @Json(name = "seed")
    val seed: kotlin.Int,

    /* A list of integrations to enable for this fine-tuning job. */
    @Json(name = "integrations")
    val integrations: kotlin.collections.List<FineTuningJobIntegrationsInner>? = null

) {

    /**
     * The object type, which is always \"fine_tuning.job\".
     *
     * Values: fine_tuningPeriodJob
     */
    @JsonClass(generateAdapter = false)
    enum class `Object`(val value: kotlin.String) {
        @Json(name = "fine_tuning.job") fine_tuningPeriodJob("fine_tuning.job");
    }
    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     *
     * Values: validating_files,queued,running,succeeded,failed,cancelled
     */
    @JsonClass(generateAdapter = false)
    enum class Status(val value: kotlin.String) {
        @Json(name = "validating_files") validating_files("validating_files"),
        @Json(name = "queued") queued("queued"),
        @Json(name = "running") running("running"),
        @Json(name = "succeeded") succeeded("succeeded"),
        @Json(name = "failed") failed("failed"),
        @Json(name = "cancelled") cancelled("cancelled");
    }
}
