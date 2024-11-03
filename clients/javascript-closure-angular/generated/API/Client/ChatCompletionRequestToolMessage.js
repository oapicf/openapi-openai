goog.provide('API.Client.ChatCompletionRequestToolMessage');

/**
 * @record
 */
API.Client.ChatCompletionRequestToolMessage = function() {}

/**
 * The role of the messages author, in this case `tool`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestToolMessage.prototype.role;

/**
 * The contents of the tool message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestToolMessage.prototype.content;

/**
 * Tool call that this message is responding to.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestToolMessage.prototype.toolCallId;

/** @enum {string} */
API.Client.ChatCompletionRequestToolMessage.RoleEnum = { 
  tool: 'tool',
}
