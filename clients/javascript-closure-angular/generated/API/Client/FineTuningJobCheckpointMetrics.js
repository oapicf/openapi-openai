goog.provide('API.Client.FineTuningJobCheckpoint_metrics');

/**
 * Metrics at the step number during the fine-tuning job.
 * @record
 */
API.Client.FineTuningJobCheckpointMetrics = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.step;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.trainLoss;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.trainMeanTokenAccuracy;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.validLoss;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.validMeanTokenAccuracy;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.fullValidLoss;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTuningJobCheckpointMetrics.prototype.fullValidMeanTokenAccuracy;

