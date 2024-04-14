goog.provide('API.Client.ChatCompletionMessageToolCallChunk');

/**
 * @record
 */
API.Client.ChatCompletionMessageToolCallChunk = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ChatCompletionMessageToolCallChunk.prototype.index;

/**
 * The ID of the tool call.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionMessageToolCallChunk.prototype.id;

/**
 * The type of the tool. Currently, only `function` is supported.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionMessageToolCallChunk.prototype.type;

/**
 * @type {!API.Client.ChatCompletionMessageToolCallChunk_function}
 * @export
 */
API.Client.ChatCompletionMessageToolCallChunk.prototype.function;

/** @enum {string} */
API.Client.ChatCompletionMessageToolCallChunk.TypeEnum = { 
  function: 'function',
}
