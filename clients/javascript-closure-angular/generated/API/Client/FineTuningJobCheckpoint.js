goog.provide('API.Client.FineTuningJobCheckpoint');

/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 * @record
 */
API.Client.FineTuningJobCheckpoint = function() {}

/**
 * The checkpoint identifier, which can be referenced in the API endpoints.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.id;

/**
 * The Unix timestamp (in seconds) for when the checkpoint was created.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.createdAt;

/**
 * The name of the fine-tuned checkpoint model that is created.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.fineTunedModelCheckpoint;

/**
 * The step number that the checkpoint was created at.
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.stepNumber;

/**
 * @type {!API.Client.FineTuningJobCheckpoint_metrics}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.metrics;

/**
 * The name of the fine-tuning job that this checkpoint was created from.
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.fineTuningJobId;

/**
 * The object type, which is always \"fine_tuning.job.checkpoint\".
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobCheckpoint.prototype.object;

/** @enum {string} */
API.Client.FineTuningJobCheckpoint.ObjectEnum = { 
  fine_tuning.job.checkpoint: 'fine_tuning.job.checkpoint',
}
