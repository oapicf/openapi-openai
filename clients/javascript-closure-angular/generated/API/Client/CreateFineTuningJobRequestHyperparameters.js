goog.provide('API.Client.CreateFineTuningJobRequest_hyperparameters');

/**
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 * @record
 */
API.Client.CreateFineTuningJobRequestHyperparameters = function() {}

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_batch_size}
 * @export
 */
API.Client.CreateFineTuningJobRequestHyperparameters.prototype.batchSize;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier}
 * @export
 */
API.Client.CreateFineTuningJobRequestHyperparameters.prototype.learningRateMultiplier;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_hyperparameters_n_epochs}
 * @export
 */
API.Client.CreateFineTuningJobRequestHyperparameters.prototype.nEpochs;

