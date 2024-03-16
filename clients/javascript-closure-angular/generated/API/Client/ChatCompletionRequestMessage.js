goog.provide('API.Client.ChatCompletionRequestMessage');

/**
 * @record
 */
API.Client.ChatCompletionRequestMessage = function() {}

/**
 * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessage.prototype.role;

/**
 * The contents of the message. `content` is required for all messages except assistant messages with function calls.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessage.prototype.content;

/**
 * The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestMessage.prototype.name;

/**
 * @type {!API.Client.ChatCompletionRequestMessage_function_call}
 * @export
 */
API.Client.ChatCompletionRequestMessage.prototype.functionCall;

/** @enum {string} */
API.Client.ChatCompletionRequestMessage.RoleEnum = { 
  system: 'system',
  user: 'user',
  assistant: 'assistant',
  function: 'function',
}
