goog.provide('API.Client.CreateCompletionResponse');

/**
 * @record
 */
API.Client.CreateCompletionResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.created;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.model;

/**
 * @type {!Array<!API.Client.CreateCompletionResponse_choices_inner>}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.choices;

/**
 * @type {!API.Client.CreateCompletionResponse_usage}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.usage;

