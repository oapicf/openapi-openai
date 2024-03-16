goog.provide('API.Client.CreateChatCompletionResponse');

/**
 * @record
 */
API.Client.CreateChatCompletionResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.created;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.model;

/**
 * @type {!Array<!API.Client.CreateChatCompletionResponse_choices_inner>}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.choices;

/**
 * @type {!API.Client.CreateCompletionResponse_usage}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.usage;

