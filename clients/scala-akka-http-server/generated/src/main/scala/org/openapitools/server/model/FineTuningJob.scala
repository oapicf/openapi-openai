package org.openapitools.server.model


/**
 * = FineTuningJob =
 *
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 *
 * @param id The object identifier, which can be referenced in the API endpoints. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the fine-tuning job was created. for example: ''null''
 * @param error  for example: ''null''
 * @param fineTunedModel The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. for example: ''null''
 * @param finishedAt The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. for example: ''null''
 * @param hyperparameters  for example: ''null''
 * @param model The base model that is being fine-tuned. for example: ''null''
 * @param `object` The object type, which is always \"fine_tuning.job\". for example: ''null''
 * @param organizationId The organization that owns the fine-tuning job. for example: ''null''
 * @param resultFiles The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). for example: ''null''
 * @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. for example: ''null''
 * @param trainedTokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. for example: ''null''
 * @param trainingFile The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). for example: ''null''
 * @param validationFile The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). for example: ''null''
 * @param integrations A list of integrations to enable for this fine-tuning job. for example: ''null''
 * @param seed The seed used for the fine-tuning job. for example: ''null''
 * @param estimatedFinish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. for example: ''null''
 * @param method  for example: ''null''
*/
final case class FineTuningJob (
  id: String,
  createdAt: Int,
  error: FineTuningJobError,
  fineTunedModel: String,
  finishedAt: Int,
  hyperparameters: FineTuningJobHyperparameters,
  model: String,
  `object`: String,
  organizationId: String,
  resultFiles: Seq[String],
  status: String,
  trainedTokens: Int,
  trainingFile: String,
  validationFile: String,
  integrations: Option[Seq[FineTuningJobIntegrationsInner]] = None,
  seed: Int,
  estimatedFinish: Option[Int] = None,
  method: Option[FineTuneMethod] = None
)

