package model

import play.api.libs.json._

/**
  * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
  * @param id The object identifier, which can be referenced in the API endpoints.
  * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created.
  * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  * @param model The base model that is being fine-tuned.
  * @param `object` The object type, which is always \"fine_tuning.job\".
  * @param organizationId The organization that owns the fine-tuning job.
  * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  * @param integrations A list of integrations to enable for this fine-tuning job.
  * @param seed The seed used for the fine-tuning job.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FineTuningJob(
  id: String,
  createdAt: Int,
  error: FineTuningJobError,
  fineTunedModel: String,
  finishedAt: Int,
  hyperparameters: FineTuningJobHyperparameters,
  model: String,
  `object`: FineTuningJob.Object.Value,
  organizationId: String,
  resultFiles: List[String],
  status: FineTuningJob.Status.Value,
  trainedTokens: Int,
  trainingFile: String,
  validationFile: String,
  integrations: Option[List[FineTuningJobIntegrationsInner]],
  seed: Int
)

object FineTuningJob {
  implicit lazy val fineTuningJobJsonFormat: Format[FineTuningJob] = Json.format[FineTuningJob]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val FineTuningJob = Value("fine_tuning.job")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val ValidatingFiles = Value("validating_files")
    val Queued = Value("queued")
    val Running = Value("running")
    val Succeeded = Value("succeeded")
    val Failed = Value("failed")
    val Cancelled = Value("cancelled")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

