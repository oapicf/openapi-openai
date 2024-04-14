goog.provide('API.Client.ChatCompletionRequestFunctionMessage');

/**
 * @record
 */
API.Client.ChatCompletionRequestFunctionMessage = function() {}

/**
 * The role of the messages author, in this case `function`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestFunctionMessage.prototype.role;

/**
 * The contents of the function message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestFunctionMessage.prototype.content;

/**
 * The name of the function to call.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestFunctionMessage.prototype.name;

/** @enum {string} */
API.Client.ChatCompletionRequestFunctionMessage.RoleEnum = { 
  function: 'function',
}
