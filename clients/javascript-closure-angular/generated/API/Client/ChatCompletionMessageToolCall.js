goog.provide('API.Client.ChatCompletionMessageToolCall');

/**
 * @record
 */
API.Client.ChatCompletionMessageToolCall = function() {}

/**
 * The ID of the tool call.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionMessageToolCall.prototype.id;

/**
 * The type of the tool. Currently, only `function` is supported.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionMessageToolCall.prototype.type;

/**
 * @type {!API.Client.ChatCompletionMessageToolCall_function}
 * @export
 */
API.Client.ChatCompletionMessageToolCall.prototype.function;

/** @enum {string} */
API.Client.ChatCompletionMessageToolCall.TypeEnum = { 
  function: 'function',
}
