goog.provide('API.Client.FineTune');

/**
 * @record
 */
API.Client.FineTune = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTune.prototype.createdAt;

/**
 * @type {!number}
 * @export
 */
API.Client.FineTune.prototype.updatedAt;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.model;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.fineTunedModel;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.organizationId;

/**
 * @type {!string}
 * @export
 */
API.Client.FineTune.prototype.status;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.FineTune.prototype.hyperparams;

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.FineTune.prototype.trainingFiles;

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.FineTune.prototype.validationFiles;

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.FineTune.prototype.resultFiles;

/**
 * @type {!Array<!API.Client.FineTuneEvent>}
 * @export
 */
API.Client.FineTune.prototype.events;

