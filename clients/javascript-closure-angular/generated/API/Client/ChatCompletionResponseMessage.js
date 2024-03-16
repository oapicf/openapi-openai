goog.provide('API.Client.ChatCompletionResponseMessage');

/**
 * @record
 */
API.Client.ChatCompletionResponseMessage = function() {}

/**
 * The role of the author of this message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionResponseMessage.prototype.role;

/**
 * The contents of the message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionResponseMessage.prototype.content;

/**
 * @type {!API.Client.ChatCompletionRequestMessage_function_call}
 * @export
 */
API.Client.ChatCompletionResponseMessage.prototype.functionCall;

/** @enum {string} */
API.Client.ChatCompletionResponseMessage.RoleEnum = { 
  system: 'system',
  user: 'user',
  assistant: 'assistant',
  function: 'function',
}
