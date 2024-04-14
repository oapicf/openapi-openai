goog.provide('API.Client.ChatCompletionTool');

/**
 * @record
 */
API.Client.ChatCompletionTool = function() {}

/**
 * The type of the tool. Currently, only `function` is supported.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionTool.prototype.type;

/**
 * @type {!API.Client.FunctionObject}
 * @export
 */
API.Client.ChatCompletionTool.prototype.function;

/** @enum {string} */
API.Client.ChatCompletionTool.TypeEnum = { 
  function: 'function',
}
