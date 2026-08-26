goog.provide('API.Client.CreateFineTuningJobRequest_integrations_inner');

/**
 * @record
 */
API.Client.CreateFineTuningJobRequestIntegrationsInner = function() {}

/**
 * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
 * @type {!string}
 * @export
 */
API.Client.CreateFineTuningJobRequestIntegrationsInner.prototype.type;

/**
 * @type {!API.Client.CreateFineTuningJobRequest_integrations_inner_wandb}
 * @export
 */
API.Client.CreateFineTuningJobRequestIntegrationsInner.prototype.wandb;

/** @enum {string} */
API.Client.CreateFineTuningJobRequestIntegrationsInner.TypeEnum = { 
  wandb: 'wandb',
}
