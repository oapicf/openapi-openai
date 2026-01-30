goog.provide('API.Client.FineTuneDPOMethod_hyperparameters');

/**
 * The hyperparameters used for the fine-tuning job.
 * @record
 */
API.Client.FineTuneDPOMethodHyperparameters = function() {}

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_beta}
 * @export
 */
API.Client.FineTuneDPOMethodHyperparameters.prototype.beta;

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_batch_size}
 * @export
 */
API.Client.FineTuneDPOMethodHyperparameters.prototype.batchSize;

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_learning_rate_multiplier}
 * @export
 */
API.Client.FineTuneDPOMethodHyperparameters.prototype.learningRateMultiplier;

/**
 * @type {!API.Client.FineTuneDPOMethod_hyperparameters_n_epochs}
 * @export
 */
API.Client.FineTuneDPOMethodHyperparameters.prototype.nEpochs;

