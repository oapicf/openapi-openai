goog.provide('API.Client.FineTuneSupervisedMethod_hyperparameters');

/**
 * The hyperparameters used for the fine-tuning job.
 * @record
 */
API.Client.FineTuneSupervisedMethodHyperparameters = function() {}

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_batch_size}
 * @export
 */
API.Client.FineTuneSupervisedMethodHyperparameters.prototype.batchSize;

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_learning_rate_multiplier}
 * @export
 */
API.Client.FineTuneSupervisedMethodHyperparameters.prototype.learningRateMultiplier;

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_n_epochs}
 * @export
 */
API.Client.FineTuneSupervisedMethodHyperparameters.prototype.nEpochs;

