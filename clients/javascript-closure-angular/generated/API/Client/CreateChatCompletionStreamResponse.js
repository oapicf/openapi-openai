goog.provide('API.Client.CreateChatCompletionStreamResponse');

/**
 * @record
 */
API.Client.CreateChatCompletionStreamResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.created;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.model;

/**
 * @type {!Array<!API.Client.CreateChatCompletionStreamResponse_choices_inner>}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.choices;

