goog.provide('API.Client.FineTuningIntegration');

/**
 * @record
 */
API.Client.FineTuningIntegration = function() {}

/**
 * The type of the integration being enabled for the fine-tuning job
 * @type {!string}
 * @export
 */
API.Client.FineTuningIntegration.prototype.type;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_integrations_inner_wandb}
 * @export
 */
API.Client.FineTuningIntegration.prototype.wandb;

/** @enum {string} */
API.Client.FineTuningIntegration.TypeEnum = { 
  wandb: 'wandb',
}
