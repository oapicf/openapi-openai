goog.provide('API.Client.FineTuningJob');

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 * @record
 */
API.Client.FineTuningJob = function() {}

/**
 * The object identifier, which can be referenced in the API endpoints.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.id;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job was created.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJob.prototype.createdAt;

/**
 * @type {!API.Client.FineTuningJob_error}
 * @export
 */
API.Client.FineTuningJob.prototype.error;

/**
 * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.fineTunedModel;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJob.prototype.finishedAt;

/**
 * @type {!API.Client.FineTuningJob_hyperparameters}
 * @export
 */
API.Client.FineTuningJob.prototype.hyperparameters;

/**
 * The base model that is being fine-tuned.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.model;

/**
 * The object type, which is always \"fine_tuning.job\".
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.object;

/**
 * The organization that owns the fine-tuning job.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.organizationId;

/**
 * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @type {!Array<!string>}
 * @export
 */
API.Client.FineTuningJob.prototype.resultFiles;

/**
 * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.status;

/**
 * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJob.prototype.trainedTokens;

/**
 * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.trainingFile;

/**
 * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
 * @type {!string}
 * @export
 */
API.Client.FineTuningJob.prototype.validationFile;

/**
 * A list of integrations to enable for this fine-tuning job.
 * @type {!Array<!API.Client.FineTuningJob_integrations_inner>}
 * @export
 */
API.Client.FineTuningJob.prototype.integrations;

/**
 * The seed used for the fine-tuning job.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJob.prototype.seed;

/**
 * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJob.prototype.estimatedFinish;

/**
 * @type {!API.Client.FineTuneMethod}
 * @export
 */
API.Client.FineTuningJob.prototype.method;

/** @enum {string} */
API.Client.FineTuningJob.ObjectEnum = { 
  fine_tuning.job: 'fine_tuning.job',
}
/** @enum {string} */
API.Client.FineTuningJob.StatusEnum = { 
  validating_files: 'validating_files',
  queued: 'queued',
  running: 'running',
  succeeded: 'succeeded',
  failed: 'failed',
  cancelled: 'cancelled',
}
