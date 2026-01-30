goog.provide('API.Client.FineTuneMethod');

/**
 * The method used for fine-tuning.
 * @record
 */
API.Client.FineTuneMethod = function() {}

/**
 * The type of method. Is either `supervised` or `dpo`.
 * @type {!string}
 * @export
 */
API.Client.FineTuneMethod.prototype.type;

/**
 * @type {!API.Client.FineTuneSupervisedMethod}
 * @export
 */
API.Client.FineTuneMethod.prototype.supervised;

/**
 * @type {!API.Client.FineTuneDPOMethod}
 * @export
 */
API.Client.FineTuneMethod.prototype.dpo;

/** @enum {string} */
API.Client.FineTuneMethod.TypeEnum = { 
  supervised: 'supervised',
  dpo: 'dpo',
}
