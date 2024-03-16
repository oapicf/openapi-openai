goog.provide('API.Client.ChatCompletionStreamResponseDelta');

/**
 * @record
 */
API.Client.ChatCompletionStreamResponseDelta = function() {}

/**
 * The role of the author of this message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.role;

/**
 * The contents of the chunk message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.content;

/**
 * @type {!API.Client.ChatCompletionRequestMessage_function_call}
 * @export
 */
API.Client.ChatCompletionStreamResponseDelta.prototype.functionCall;

/** @enum {string} */
API.Client.ChatCompletionStreamResponseDelta.RoleEnum = { 
  system: 'system',
  user: 'user',
  assistant: 'assistant',
  function: 'function',
}
