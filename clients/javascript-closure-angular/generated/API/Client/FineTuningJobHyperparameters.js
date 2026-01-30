goog.provide('API.Client.FineTuningJob_hyperparameters');

/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 * @record
 */
API.Client.FineTuningJobHyperparameters = function() {}

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_batch_size}
 * @export
 */
API.Client.FineTuningJobHyperparameters.prototype.batchSize;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier}
 * @export
 */
API.Client.FineTuningJobHyperparameters.prototype.learningRateMultiplier;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_n_epochs}
 * @export
 */
API.Client.FineTuningJobHyperparameters.prototype.nEpochs;

