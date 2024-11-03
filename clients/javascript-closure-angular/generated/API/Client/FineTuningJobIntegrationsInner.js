goog.provide('API.Client.FineTuningJob_integrations_inner');

/**
 * @record
 */
API.Client.FineTuningJobIntegrationsInner = function() {}

/**
 * The type of the integration being enabled for the fine-tuning job
 * @type {!string}
 * @export
 */
API.Client.FineTuningJobIntegrationsInner.prototype.type;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_integrations_inner_wandb}
 * @export
 */
API.Client.FineTuningJobIntegrationsInner.prototype.wandb;

/** @enum {string} */
API.Client.FineTuningJobIntegrationsInner.TypeEnum = { 
  wandb: 'wandb',
}
