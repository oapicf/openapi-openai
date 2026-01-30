package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FineTuneMethod
import org.openapitools.models.FineTuningJobError
import org.openapitools.models.FineTuningJobHyperparameters
import org.openapitools.models.FineTuningJobIntegrationsInner
import scala.collection.immutable.Seq

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 * @param id The object identifier, which can be referenced in the API endpoints.
 * @param createdUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @param error 
 * @param fineUnderscoretunedUnderscoremodel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @param finishedUnderscoreat The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @param hyperparameters 
 * @param model The base model that is being fine-tuned.
 * @param _object The object type, which is always \"fine_tuning.job\".
 * @param organizationUnderscoreid The organization that owns the fine-tuning job.
 * @param resultUnderscorefiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @param trainedUnderscoretokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @param trainingUnderscorefile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param validationUnderscorefile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @param integrations A list of integrations to enable for this fine-tuning job.
 * @param seed The seed used for the fine-tuning job.
 * @param estimatedUnderscorefinish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
 * @param method 
 */
case class FineTuningJob(id: String,
                createdUnderscoreat: Int,
                error: FineTuningJobError,
                fineUnderscoretunedUnderscoremodel: String,
                finishedUnderscoreat: Int,
                hyperparameters: FineTuningJobHyperparameters,
                model: String,
                _object: String,
                organizationUnderscoreid: String,
                resultUnderscorefiles: Seq[String],
                status: String,
                trainedUnderscoretokens: Int,
                trainingUnderscorefile: String,
                validationUnderscorefile: String,
                integrations: Option[Seq[FineTuningJobIntegrationsInner]],
                seed: Int,
                estimatedUnderscorefinish: Option[Int],
                method: Option[FineTuneMethod]
                )

object FineTuningJob {
    /**
     * Creates the codec for converting FineTuningJob from and to JSON.
     */
    implicit val decoder: Decoder[FineTuningJob] = deriveDecoder
    implicit val encoder: ObjectEncoder[FineTuningJob] = deriveEncoder
}
