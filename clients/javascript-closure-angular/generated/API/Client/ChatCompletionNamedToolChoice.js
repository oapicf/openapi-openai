goog.provide('API.Client.ChatCompletionNamedToolChoice');

/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 * @record
 */
API.Client.ChatCompletionNamedToolChoice = function() {}

/**
 * The type of the tool. Currently, only `function` is supported.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionNamedToolChoice.prototype.type;

/**
 * @type {!API.Client.ChatCompletionNamedToolChoice_function}
 * @export
 */
API.Client.ChatCompletionNamedToolChoice.prototype.function;

/** @enum {string} */
API.Client.ChatCompletionNamedToolChoice.TypeEnum = { 
  function: 'function',
}
