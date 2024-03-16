goog.provide('API.Client.CreateEditResponse');

/**
 * @record
 */
API.Client.CreateEditResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateEditResponse.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateEditResponse.prototype.created;

/**
 * @type {!Array<!API.Client.CreateEditResponse_choices_inner>}
 * @export
 */
API.Client.CreateEditResponse.prototype.choices;

/**
 * @type {!API.Client.CreateCompletionResponse_usage}
 * @export
 */
API.Client.CreateEditResponse.prototype.usage;

