/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 * @param id The object identifier, which can be referenced in the API endpoints.
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param error 
 * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @param hyperparameters 
 * @param model The base model that is being fine-tuned.
 * @param object The object type, which is always \"fine_tuning.job\".
 * @param organizationId The organization that owns the fine-tuning job.
 * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param seed The seed used for the fine-tuning job.
 * @param integrations A list of integrations to enable for this fine-tuning job.
 */
object FineTuningJobs : BaseTable<FineTuningJob>("FineTuningJob") {
    val id = text("id") /* The object identifier, which can be referenced in the API endpoints. */
    val createdAt = int("created_at") /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
    val error = long("error")
    val fineTunedModel = text("fine_tuned_model") /* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
    val finishedAt = int("finished_at") /* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
    val hyperparameters = long("hyperparameters")
    val model = text("model") /* The base model that is being fine-tuned. */
    val object = text("object").transform({ FineTuningJob.Object.valueOf(it) }, { it.value }) /* The object type, which is always \"fine_tuning.job\". */
    val organizationId = text("organization_id") /* The organization that owns the fine-tuning job. */
    val status = text("status").transform({ FineTuningJob.Status.valueOf(it) }, { it.value }) /* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
    val trainedTokens = int("trained_tokens") /* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
    val trainingFile = text("training_file") /* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
    val validationFile = text("validation_file") /* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
    val seed = int("seed") /* The seed used for the fine-tuning job. */

    /**
     * Create an entity of type FineTuningJob from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = FineTuningJob(
        id = row[id] ?: "" /* kotlin.String */ /* The object identifier, which can be referenced in the API endpoints. */,
        createdAt = row[createdAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */,
        error = FineTuningJobErrors.createEntity(row, withReferences) /* FineTuningJobError */,
        fineTunedModel = row[fineTunedModel] ?: "" /* kotlin.String */ /* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */,
        finishedAt = row[finishedAt] ?: 0 /* kotlin.Int */ /* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */,
        hyperparameters = FineTuningJobHyperparameterss.createEntity(row, withReferences) /* FineTuningJobHyperparameters */,
        model = row[model] ?: "" /* kotlin.String */ /* The base model that is being fine-tuned. */,
        object = row[object] ?: FineTuningJob.Object.valueOf("") /* kotlin.String */ /* The object type, which is always \"fine_tuning.job\". */,
        organizationId = row[organizationId] ?: "" /* kotlin.String */ /* The organization that owns the fine-tuning job. */,
        resultFiles = emptyList() /* kotlin.Array<kotlin.String> */ /* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */,
        status = row[status] ?: FineTuningJob.Status.valueOf("") /* kotlin.String */ /* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */,
        trainedTokens = row[trainedTokens] ?: 0 /* kotlin.Int */ /* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */,
        trainingFile = row[trainingFile] ?: "" /* kotlin.String */ /* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */,
        validationFile = row[validationFile] ?: "" /* kotlin.String */ /* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */,
        seed = row[seed] ?: 0 /* kotlin.Int */ /* The seed used for the fine-tuning job. */,
        integrations = emptyList() /* kotlin.Array<FineTuningJobIntegrationsInner>? */ /* A list of integrations to enable for this fine-tuning job. */
    )

    /**
    * Assign all the columns from the entity of type FineTuningJob to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = FineTuningJob()
    * database.update(FineTuningJobs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: FineTuningJob) {
        this.apply {
            set(FineTuningJobs.id, entity.id)
            set(FineTuningJobs.createdAt, entity.createdAt)
            set(FineTuningJobs.error, entity.error)
            set(FineTuningJobs.fineTunedModel, entity.fineTunedModel)
            set(FineTuningJobs.finishedAt, entity.finishedAt)
            set(FineTuningJobs.hyperparameters, entity.hyperparameters)
            set(FineTuningJobs.model, entity.model)
            set(FineTuningJobs.object, entity.object)
            set(FineTuningJobs.organizationId, entity.organizationId)
            set(FineTuningJobs.status, entity.status)
            set(FineTuningJobs.trainedTokens, entity.trainedTokens)
            set(FineTuningJobs.trainingFile, entity.trainingFile)
            set(FineTuningJobs.validationFile, entity.validationFile)
            set(FineTuningJobs.seed, entity.seed)
        }
    }

}


object FineTuningJobResultFiles : BaseTable<Pair<kotlin.Long, kotlin.String>>("FineTuningJobResultFiles") {
    val fineTuningJob = long("fineTuningJob")
    val resultFiles = text("resultFiles")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[fineTuningJob] ?: 0, row[resultFiles] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(FineTuningJobResultFiles.fineTuningJob, entity.first)
            set(FineTuningJobResultFiles.resultFiles, entity.second)
        }
    }

}

object FineTuningJobFineTuningJobIntegrationsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("FineTuningJobFineTuningJobIntegrationsInner") {
    val fineTuningJob = long("fineTuningJob")
    val fineTuningJobIntegrationsInner = long("fineTuningJobIntegrationsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[fineTuningJob] ?: 0, row[fineTuningJobIntegrationsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(FineTuningJobFineTuningJobIntegrationsInner.fineTuningJob, entity.first)
            set(FineTuningJobFineTuningJobIntegrationsInner.fineTuningJobIntegrationsInner, entity.second)
        }
    }

}

